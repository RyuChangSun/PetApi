package com.rest.api.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.rest.api.common.util.CommonUtil;
import com.rest.api.member.model.Member;
import com.rest.api.board.model.Board;
import com.rest.api.board.service.BoardService;

@Controller
public class BoardController {

    @Autowired
    BoardService boardService;
    
    @ResponseBody
    @RequestMapping(value = "/boardList", method = RequestMethod.POST)
    public String memberList() {

    	List<Board> board =  boardService.getBoardList();
    	String json = CommonUtil.convertStringByModel(board);
    	
    
//    	ModelAndView model = new ModelAndView();
//		model.addObject("resultType", "boardList");
//        model.addObject("board", board);
//        model.addObject("jsonString", json);
//        model.setViewName("/board/board");
        
        return json;
    }
//
//    @RequestMapping(value = "/memberByUserNo", method = RequestMethod.GET)    
//    public ModelAndView memberByUserNo(
//    		@RequestParam(value="user_no", defaultValue="1") int user_no) {
//    
//    	Board board =  boardService.getMemberByUserNo(user_no);
//    	String json = CommonUtil.convertStringByModel(board);
//
//    	ModelAndView model = new ModelAndView();
//		model.addObject("resultType", "memberByUserNo");
//        model.addObject("member", board);
//        model.addObject("jsonString", json);
//        model.setViewName("/member/member");
//        
//        return model;
//    }
//    
//    @RequestMapping(value = "/insertMember", method = RequestMethod.GET)
//    public ModelAndView insertMember(
//    		@RequestParam(value="email") String email,
//    		@RequestParam(value="name") String name,
//    		@RequestParam(value="password") String password) {
//    	
//    	Board board = new Board();
//    	board.setEmail(email);
//    	board.setName(name);
//    	board.setPassword(password);
//        
//    	boardService.insertMember(board);
//    	String json = CommonUtil.convertStringByModel(board);
//    	
//    	ModelAndView model = new ModelAndView();
//		model.addObject("resultType", "insertMember");
//        model.addObject("member", board);		
//        model.addObject("jsonString", json);
//        model.setViewName("/member/member");
//                
//        return model;
//    }
//    
//    @RequestMapping(value = "/updateMember", method = RequestMethod.GET)
//    public ModelAndView updateMember(
//    		@RequestParam(value="user_no") int user_no,
//    		@RequestParam(value="email") String email,
//    		@RequestParam(value="name") String name,
//    		@RequestParam(value="password") String password) {
//
//    	Board board = new Board();
//    	board.setUser_no(user_no);    	
//    	board.setEmail(email);
//    	board.setName(name);
//    	board.setPassword(password);
//    	
//    	boardService.updateMember(board);
//    	String json = CommonUtil.convertStringByModel(board);
//    	
//    	ModelAndView model = new ModelAndView();
//		model.addObject("resultType", "updateMember");
//        model.addObject("member", board);		
//        model.addObject("jsonString", json);
//        model.setViewName("/member/member");
//                
//        return model;
//    }
//    
//    @RequestMapping(value = "/deleteMember", method = RequestMethod.GET)
//    public ModelAndView deleteMember(
//    		@RequestParam(value="user_no") int user_no) {
//    	
//    	int result = boardService.deleteMember(user_no);
//    	String json = CommonUtil.convertStringByModel(result);
//    	
//    	ModelAndView model = new ModelAndView();
//		model.addObject("resultType", "deleteMember");
//        model.addObject("jsonString", json);
//        model.setViewName("/member/member");
//                
//        return model;
//    }
}
