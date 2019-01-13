package com.baegood.fcspringboot.controllers;

import com.baegood.fcspringboot.dto.Board;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/boards")
@Slf4j
public class BoardController {

    @GetMapping
    public String list(HttpSession session, ModelMap model) {
        Board b = Board.builder()
            .title("타이틀1")
            .name("bae")
            .content("컨텐트1")
            .build();

        List<Board> list = Arrays.asList(
            new Board("톼이투를", "나메", "컨텐트트트트트틏츠츠츠츠츠"),
            b,
            new Board("톼이투1", "솽우", "컨텐텐ㅌ츄츄츄츛츄츄츛츄츄")
        );

        session.setAttribute("sessionValue", "hello Session!!!");

        model.addAttribute("test", "tttttt");
        model.addAttribute("count", list.size());
        model.addAttribute("list", list);

        return "list";
    }

    @GetMapping(params = "format=csv")
    public String listCsv(Model model) {
        Board b = Board.builder()
            .title("csv title")
            .name("상우상")
            .content("상웅사아앙아아아아아앙앙")
            .build();

        List<Board> list = Arrays.asList(
            new Board("톼이투를", "나메", "컨텐트트트트트틏츠츠츠츠츠"),
            b,
            new Board("톼이투1", "솽우", "컨텐텐ㅌ츄츄츄츛츄츄츛츄츄")
        );

        model.addAttribute("list", list);

        return "csvView";
    }

    @GetMapping("{id}")
    public String view(@PathVariable Long id, Model model) {
        log.debug("Request id : {}", id);

        model.addAttribute("id", id);

        return "view";
    }

    @GetMapping("write")
    public String write() {
        return "redirect:/boards";
    }
}
