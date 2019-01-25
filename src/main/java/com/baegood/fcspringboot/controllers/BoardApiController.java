package com.baegood.fcspringboot.controllers;

import com.baegood.fcspringboot.dto.Board;
import com.baegood.fcspringboot.dto.Boards;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/api/boards")
public class BoardApiController {

    @GetMapping
    public ResponseEntity<?> getList() {
        return ResponseEntity.ok(
            new Boards(
                Arrays.asList(
                    new Board("my title1", "my name1", "my content1"),
                    new Board("my title2", "my name2", "my content2"),
                    new Board("my title3", "my name3", "my content3")
                )
            )
        );
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getABoard(@PathVariable Long id) {
        Board board = new Board("my title", "my name", "my content");
        board.setId(id);
        return ResponseEntity.ok(board);
    }
}
