package com.baegood.fcspringboot.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Board {

    private Long id;
    private String title;
    private String name;
    private String content;
    private LocalDateTime createdDate;
    private int readCount;

    @Builder
    public Board(String title, String name, String content) {
        this.title = title;
        this.name = name;
        this.content = content;

        this.id = 0L;
        this.createdDate = LocalDateTime.now();
        this.readCount = 0;
    }
}
