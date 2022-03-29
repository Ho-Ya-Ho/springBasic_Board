package com.example.test.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Board {
    private int boardId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createDate;
    private int count;
    private Long memberId;
}
