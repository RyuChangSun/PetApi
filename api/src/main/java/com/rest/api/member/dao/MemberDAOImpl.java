package com.rest.api.member.dao;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.api.member.model.Member;

@Repository("memberDao")
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	@Resource(name="sqlSessionMaster")
    private SqlSession sqlSessionMaster;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSessionMaster = sqlSession;
    }
 
    @Override
    public Member SignIn(String id, String pass)
    {
    	HashMap<String, String> input = new HashMap<String, String>();
    	input.put("id", id);
    	input.put("pass", pass);
    	
    	return sqlSessionMaster.selectOne("signIn", input);
    }
    
    @Override
    public int SignUp(Member member) {
    	return sqlSessionMaster.insert("SignUp", member);
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
