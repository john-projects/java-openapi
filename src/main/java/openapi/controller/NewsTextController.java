package openapi.controller;


import openapi.domain.NewsText;
import openapi.domain.NewsTextRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsTextController {
    @Autowired
    private NewsTextRepository newsTextRepository;

    @RequestMapping(value = "/news/text/{news_id}")
    public List<NewsText> newsTextFindNewsId(@PathVariable("news_id") String newsId){
        return newsTextRepository.findByNewsId(newsId);
    }
}
