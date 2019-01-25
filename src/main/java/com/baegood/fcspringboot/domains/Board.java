package com.baegood.fcspringboot.domains;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "board")
@Getter
@Setter
public class Board {

    public Board(String name, String title, String content) {
        this.name = name;
        this.title = title;
        this.content = content;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String title;

    private String content;

    private int readCount = 0;

    @Column(name = "regdate")
    private LocalDate regDate = LocalDate.now();

    @Override
    public String toString() {
        return "Board{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", title='" + title + '\'' +
            ", content='" + content + '\'' +
            ", readCount=" + readCount +
            ", regDate=" + regDate +
            '}';
    }
}
