package com.baegood.fcspringboot.domains;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void getAll() {
        boardRepository.findAll().forEach(System.out::println);
    }

    @Test
    public void create() {
        Board b = new Board("이름", "타이틀", "내용");

        System.out.println(boardRepository.save(b));
    }

    @Test
    @Rollback(false)
    public void update() {
        Optional<Board> byId = boardRepository.findById(1L);

        byId.get().setName("ㅁㄴㅇㅁㅇㅁㄴㅇㄴㅁㅇㅁㅇㅁㅇ");
    }
}
