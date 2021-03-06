package com.rest.api.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.api.dao.MemberDAO;
import com.rest.api.model.Member;

@Repository("memberDao")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	@Resource(name="sqlSessionMaster")
    private SqlSession sqlSessionMaster;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSessionMaster = sqlSession;
    }
 
    @Override
    public List<Member> getMemberList() {         
        return sqlSessionMaster.selectList("getMemberList");
    }
    
    @Override
    public Member getMemberByUserNo(int user_no) {
    	return sqlSessionMaster.selectOne("getMemberByUserNo", user_no);
    }
    
    @Override
    public int insertMember(Member member) {
    	return sqlSessionMaster.insert("insertMember", member);
    }
    
    @Override
    public int updateMember(Member member) {
    	return sqlSessionMaster.update("updateMember", member);
    }
    
    @Override
    public int deleteMember(int user_no) {
    	return sqlSessionMaster.delete("deleteMember", user_no);
    }
}
