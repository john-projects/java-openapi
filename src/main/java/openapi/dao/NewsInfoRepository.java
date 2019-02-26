package openapi.dao;

import openapi.entity.NewsInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsInfoRepository extends JpaRepository<NewsInfo, Integer> {
    NewsInfo findById(int id);
}
