package com.rest.api.board.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.rest.api.board.dao.BoardDAO;
import com.rest.api.board.model.Board;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

    @Resource(name="boardDao")
    private BoardDAO boardDao;
 
    @Override
    public List<Board> getBoardList() {
        return boardDao.getBoardList();
    }
   /* 
    @Override
    public Board getMemberByUserNo(int user_no) {
    	return boardDao.getMemberByUserNo(user_no);
    }
    
    @Override
    public int insertMember(Board board) {
    	return boardDao.insertMember(board);
    }
    
    @Override
    public int updateMember(Board board) {
    	return boardDao.updateMember(board);
    }
    
    @Override
    public int deleteMember(int user_no) {
    	return boardDao.deleteMember(user_no);
    }   */ 
}
