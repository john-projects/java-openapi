package openapi.controller;


import openapi.domain.NewsInfoRepository;
import openapi.domain.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsInfoController {
    @Autowired
    private NewsInfoRepository newsInfoRepository;

    @RequestMapping(value = "/news/id={id}")
    public List<NewsInfo> newsInfoFindId(@PathVariable("id") Integer id){
        return newsInfoRepository.findById(id);
    }

    @RequestMapping(value = "/news/all")
    public List<NewsInfo> newsInfoFindAll(){
        return newsInfoRepository.findAll();
    }

    @RequestMapping(value = "/news/news_id={news_id}")
    public List<NewsInfo> newsInfoFindNewsId(@PathVariable("news_id") String news_id){
        return newsInfoRepository.findByNewsId(news_id);
    }

    @RequestMapping(value = "/news/title={title}")
    public List<NewsInfo> newsInfoFindTitle(@PathVariable("title") String title){
        return newsInfoRepository.findByTitle(title);
    }

}
