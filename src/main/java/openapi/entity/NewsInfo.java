package openapi.entity;


import javax.persistence.*;

@Entity
@Table(name = "news_info")
public class NewsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    private int add_time;
    private int news_time;
    private String news_id;
    private String title;
    private String news_web_source;
    private String news_web_source_url;
    private String ep_source;
    private String editor;
    private String news_introduction;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public int getAdd_time(){return add_time;}
    public void setAdd_time(int add_time){this.add_time = add_time;}

    public int getNews_time(){return news_time;}
    public void setNews_time(int news_time){this.news_time = news_time;}

    public String getNews_id(){return news_id;}
    public void setNews_id(String news_id){this.news_id = news_id;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    public String getNews_web_source(){return news_web_source;}
    public void setNews_web_source(String news_web_source){this.news_web_source = news_web_source;}

    public String getNews_web_source_url(){return news_web_source_url;}
    public void setNews_web_source_url(String news_web_source_url){this.news_web_source_url = news_web_source_url;}

    public String getEp_source(){return ep_source;}
    public void setEp_source(String ep_source){this.ep_source = ep_source;}

    public String getEditor(){return editor;}
    public void setEditor(String editor){this.editor = editor;}

    public String getNews_introduction(){return news_introduction;}
    public void setNews_introduction(String news_introduction){this.news_introduction = news_introduction;}
}
