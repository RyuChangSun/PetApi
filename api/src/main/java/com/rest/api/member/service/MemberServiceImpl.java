package com.rest.api.member.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rest.api.member.dao.MemberDAO;
import com.rest.api.member.model.Member;

@Service("memberService")
public class MemberServiceImpl implements MemberService{

    @Resource(name="memberDao")
    private MemberDAO memberDao;
 
    @Override
    public Member SignIn(String id, String pass)
    {
    	return memberDao.SignIn(id, pass);
    }
    
    @Override
    public int SignUp(Member member) {
    	return memberDao.SignUp(member);
    }    
    
    @Override
    public List<Member> getMemberList() {
        return memberDao.getMemberList();
    }
    
    @Override
    public Member getMemberByUserNo(int user_no) {
    	return memberDao.getMemberByUserNo(user_no);
    }
    
    @Override
    public int insertMember(Member member) {
    	return memberDao.insertMember(member);
    }
    
    @Override
    public int updateMember(Member member) {
    	return memberDao.updateMember(member);
    }
    
    @Override
    public int deleteMember(int user_no) {
    	return memberDao.deleteMember(user_no);
    }    
}
