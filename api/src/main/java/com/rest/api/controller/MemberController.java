package com.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.rest.api.model.Member;
import com.rest.api.service.MemberService;
import com.rest.api.util.CommonUtil;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;
     
    @RequestMapping(value = "/memberList", method = RequestMethod.GET)
    public ModelAndView memberList() {

    	List<Member> members =  memberService.getMemberList();
    	String json = CommonUtil.convertStringByModel(members);
    	
    	ModelAndView model = new ModelAndView();
		model.addObject("resultType", "memberList");
        model.addObject("members", members);
        model.addObject("jsonString", json);
        model.setViewName("/member/member");
        
        return model;
    }

    @RequestMapping(value = "/memberByUserNo", method = RequestMethod.GET)    
    public ModelAndView memberByUserNo(
    		@RequestParam(value="user_no", defaultValue="1") int user_no) {
    
    	Member member =  memberService.getMemberByUserNo(user_no);
    	String json = CommonUtil.convertStringByModel(member);

    	ModelAndView model = new ModelAndView();
		model.addObject("resultType", "memberByUserNo");
        model.addObject("member", member);
        model.addObject("jsonString", json);
        model.setViewName("/member/member");
        
        return model;
    }
    
    @RequestMapping(value = "/insertMember", method = RequestMethod.GET)
    public ModelAndView insertMember(
    		@RequestParam(value="email") String email,
    		@RequestParam(value="name") String name,
    		@RequestParam(value="password") String password) {
    	
    	Member member = new Member();
    	member.setEmail(email);
    	member.setName(name);
    	member.setPassword(password);
        
    	memberService.insertMember(member);
    	String json = CommonUtil.convertStringByModel(member);
    	
    	ModelAndView model = new ModelAndView();
		model.addObject("resultType", "insertMember");
        model.addObject("member", member);		
        model.addObject("jsonString", json);
        model.setViewName("/member/member");
                
        return model;
    }
    
    @RequestMapping(value = "/updateMember", method = RequestMethod.GET)
    public ModelAndView updateMember(
    		@RequestParam(value="user_no") int user_no,
    		@RequestParam(value="email") String email,
    		@RequestParam(value="name") String name,
    		@RequestParam(value="password") String password) {

    	Member member = new Member();
    	member.setUser_no(user_no);    	
    	member.setEmail(email);
    	member.setName(name);
    	member.setPassword(password);
    	
    	memberService.updateMember(member);
    	String json = CommonUtil.convertStringByModel(member);
    	
    	ModelAndView model = new ModelAndView();
		model.addObject("resultType", "updateMember");
        model.addObject("member", member);		
        model.addObject("jsonString", json);
        model.setViewName("/member/member");
                
        return model;
    }
    
    @RequestMapping(value = "/deleteMember", method = RequestMethod.GET)
    public ModelAndView deleteMember(
    		@RequestParam(value="user_no") int user_no) {
    	
    	int result = memberService.deleteMember(user_no);
    	String json = CommonUtil.convertStringByModel(result);
    	
    	ModelAndView model = new ModelAndView();
		model.addObject("resultType", "deleteMember");
        model.addObject("jsonString", json);
        model.setViewName("/member/member");
                
        return model;
    }
}
