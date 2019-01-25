package com.baegood.fcspringboot.dto;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor

public class Boards {

    @JacksonXmlElementWrapper(localName = "boards")
    @JacksonXmlProperty(localName = "board")
    private List<Board> boards;
}
