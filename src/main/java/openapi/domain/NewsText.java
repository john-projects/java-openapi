package openapi.domain;


import javax.persistence.*;

@Entity
@Table(name = "news_text")
public class NewsText {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name = "news_id", nullable = false)
    private String newsId;

    @Lob
    @Column(name = "news_text", nullable = false, columnDefinition = "text")
    private String newsText;

    public int getId(){return id;}
    public void setId(int id){this.id = id;}

    public String getNewsId(){return newsId;}
    public void setNewsId(String newsId){this.newsId = newsId;}

    public String  getNewsText(){return newsText;}
    public void setNewsText(String  newsText){this.newsText = newsText;}
}
