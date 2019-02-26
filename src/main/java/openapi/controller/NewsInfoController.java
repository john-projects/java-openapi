package openapi.controller;


import openapi.dao.NewsInfoRepository;
import openapi.entity.NewsInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewsInfoController {
    @Autowired
    private NewsInfoRepository newsInfoRepository;

    @RequestMapping(value = "/news/{id}")
    public NewsInfo newsInfoFindOne(@PathVariable("id") Integer id){
        return newsInfoRepository.findOne(id);
    }

}
