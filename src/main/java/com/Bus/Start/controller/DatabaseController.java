package com.Bus.Start.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DatabaseController {
    @GetMapping("/")
    public String home(){
        return "database";
    }
}


//package com.example.board.controller;
//
//        import com.example.board.dto.BoardDTO;
//        import com.example.board.service.BoardService;
//        import lombok.RequiredArgsConstructor;
//        import org.springframework.stereotype.Controller;
//        import org.springframework.web.bind.annotation.*;
//
////@Controller
////public class BoardController {
////    @GetMapping("/board/save")
////    public String saveForm(){
////        return "save";
////    }
////}
////밑과 같음
//
//@Controller
//@RequiredArgsConstructor
//@RequestMapping("/board")
//public class BoardController {
//    private final BoardService boardService;
//
//
//    @GetMapping("/save")
//    public String saveForm()    {return "save";}
//
//    @PostMapping("/save")
//    public String save(@ModelAttribute BoardDTO boardDTO) {
//        System.out.printf("board = " + boardDTO);
//        boardService.save(boardDTO);
//
//        return null;
//    }
//}
