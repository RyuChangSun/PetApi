package com.rest.api.dao;

import java.util.List;

import com.rest.api.model.Member;

public interface MemberDAO {
	List<Member> getMemberList();
	Member getMemberByUserNo(int user_no);
	int insertMember(Member member);
	int updateMember(Member member);
	int deleteMember(int user_no);
}
