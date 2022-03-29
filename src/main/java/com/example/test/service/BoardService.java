package com.example.test.service;

import com.example.test.domain.Board;
import com.example.test.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BoardService {

    private final BoardMapper boardMapper;

    public int boardCount() {
        return boardMapper.boardCount();
    }

    public List<Board> boardList(){
        return boardMapper.getList();
    }

    public Board getBoard(int boardId){
        return boardMapper.getBoard(boardId);
    }

    public void uploadBoard(Board board){
        boardMapper.uploadBoard(board);
    }

    public void updateBoard(Board board){
        boardMapper.updateBoard(board);
    }

    public void deleteBoard(int boardId){
        boardMapper.deleteBoard(boardId);
    }

    public int viewCount(int boardId){
        return boardMapper.viewCount(boardId);
    }
}