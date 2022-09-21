package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRespository articleRespository;

    public void write(String title, String content){
        Article article = new Article();
        article.setTitle(title);
        article.setContent(content);
        articleRespository.save(article);
    }
}

