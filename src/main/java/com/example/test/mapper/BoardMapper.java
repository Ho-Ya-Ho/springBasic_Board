package com.example.test.mapper;

import com.example.test.domain.Board;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardMapper {
    int boardCount();

    List<Board> getList();

    Board getBoard(int boardId);

    void uploadBoard(Board board);

    void updateBoard(Board board);

    void deleteBoard(int board);

    int viewCount(int boardid);
}
