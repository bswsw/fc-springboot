package com.baegood.fcspringboot.components;

import com.baegood.fcspringboot.dto.Board;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

@Component("csvView")
public class CsvView implements View {

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        PrintWriter out = response.getWriter();
        List<Board> boards = (List<Board>) model.get("list");

        for (Board board : boards) {
            out.println(board.getReadCount() + "," + board.getTitle() + "," + board.getName());
        }

        out.close();
    }

    @Override
    public String getContentType() {
        return "text/csv";
    }
}
