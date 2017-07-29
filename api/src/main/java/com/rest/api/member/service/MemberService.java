package com.rest.api.member.service;

import java.util.List;

import com.rest.api.member.model.Member;

public interface MemberService {
    
	Member SignIn(String id, String pass);
	
    List<Member> getMemberList();
    Member getMemberByUserNo(int user_no);
    int insertMember(Member member);
    int updateMember(Member member);
    int deleteMember(int user_no);    
}