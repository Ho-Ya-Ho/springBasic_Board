package com.example.test.controller;

import com.example.test.domain.Board;
import com.example.test.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


@Controller
@RequiredArgsConstructor
public class BoardController {

    private final BoardService service;

    @GetMapping("/hello")
    public String Hello(){
        return "/board/hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("cnt", service.boardCount());
        model.addAttribute("test", service.boardList());

        return "board/hello";
    }

    @GetMapping("/main")
    public String main(Model model){
        model.addAttribute("List", service.boardList());
        return "/board/main";
    }

    @GetMapping("/view")
    public String viewBoard(Model model, Integer boardId){
        if (boardId == null) {
            return "/board/hello";
        }
        model.addAttribute("view", service.getBoard(boardId));
        return "/board/view";
    }

    @GetMapping("/upload")
    public String uploadBoardForm(){
        return "/board/upload";
    }

    @PostMapping("/upload")
    public String uploadboardForm(Board board){
        service.uploadBoard(board);
        return "redirect:/main";
    }

    @PutMapping("/update")
    public String updateboard(Board board){
        service.updateBoard(board);
        return "redirect:/main";
    }

    @DeleteMapping ("/delete")
    public String deleteboard(int boardId){
        service.deleteBoard(boardId);
        return "redirect:/main";
    }
}
