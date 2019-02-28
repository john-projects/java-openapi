package openapi.domain;


import javax.persistence.*;


/// 因下划线是 jpa 的保留字，所以字段包含下划线需要转换
@Entity
@Table(name = "news_info")
public class NewsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "add_time", nullable = false)
    private int addTime;

    @Column(name = "news_time", nullable = false)
    private int newsTime;

    @Column(name = "news_id", nullable = false)
    private String newsId;

    private String title;

    @Column(name = "news_web_source", nullable = false)
    private String newsWebSource;

    @Column(name = "news_web_source_url", nullable = false)
    private String newsWebSourceUrl;

    @Column(name = "ep_source", nullable = false)
    private String epSource;

    private String editor;

    @Column(name = "news_introduction", nullable = false)
    private String newsIntroduction;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public int getAddTime(){return addTime;}
    public void setAddTime(int addTime){this.addTime = addTime;}

    public int getNewsTime(){return newsTime;}
    public void setNewsTime(int newsTime){this.newsTime = newsTime;}

    public String getNewsId(){return newsId;}
    public void setNewsId(String newsId){this.newsId = newsId;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}

    public String getNewsWebSource(){return newsWebSource;}
    public void setNewsWebSource(String newsWebSource){this.newsWebSource = newsWebSource;}

    public String getNewsWebSourceUrl(){return newsWebSourceUrl;}
    public void setNewsWebSourceUrl(String news_web_source_url){this.newsWebSourceUrl = newsWebSourceUrl;}

    public String getEpSource(){return epSource;}
    public void setEpSource(String epSource){this.epSource = epSource;}

    public String getEditor(){return editor;}
    public void setEditor(String editor){this.editor = editor;}

    public String getNewsIntroduction(){return newsIntroduction;}
    public void setNewsIntroduction(String newsIntroduction){this.newsIntroduction = newsIntroduction;}
}
