package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ArticleController {
    private final ArticleRespository articleRespository;

    @RequestMapping("/list")
    public String list(Model model){
        List<Article> articles = articleRespository.findAll();
        model.addAttribute("articles",articles);
        return "list";
    }

}
