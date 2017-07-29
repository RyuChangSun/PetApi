package com.rest.api.member.dao;

import java.util.List;

import com.rest.api.member.model.Member;

public interface MemberDAO {

	Member SignIn(String id, String pass);
	int SignUp(Member member);

	List<Member> getMemberList();
	Member getMemberByUserNo(int user_no);
	int insertMember(Member member);
	int updateMember(Member member);
	int deleteMember(int user_no);
}
