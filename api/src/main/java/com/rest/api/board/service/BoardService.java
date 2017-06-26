package com.rest.api.board.service;

import java.util.List;

import com.rest.api.board.model.Board;

public interface BoardService {
     
    List<Board> getBoardList();
   /* Board getMemberByUserNo(int user_no);
    int insertMember(Board board);
    int updateMember(Board board);
    int deleteMember(int user_no);  */
}