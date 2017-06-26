package com.rest.api.board.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.rest.api.board.model.Board;
import com.rest.api.member.model.Member;

@Repository("boardDao")
public class BoardDAOImpl implements BoardDAO {

	@Autowired
	@Resource(name="sqlSessionMaster")
    private SqlSession sqlSessionMaster;
 
    public void setSqlSession(SqlSession sqlSession){
        this.sqlSessionMaster = sqlSession;
    }
 
    @Override
    public List<Board> getBoardList() {         
        return sqlSessionMaster.selectList("getBoardList");
    }
  /*  
    @Override
    public Board getMemberByUserNo(int user_no) {
    	return sqlSessionMaster.selectOne("getMemberByUserNo", user_no);
    }
    
    @Override
    public int insertMember(Board board) {
    	return sqlSessionMaster.insert("insertMember", board);
    }
    
    @Override
    public int updateMember(Board board) {
    	return sqlSessionMaster.update("updateMember", board);
    }
    
    @Override
    public int deleteMember(int user_no) {
    	return sqlSessionMaster.delete("deleteMember", user_no);
    }*/
}
