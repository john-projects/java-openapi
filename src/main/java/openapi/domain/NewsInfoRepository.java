package openapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NewsInfoRepository extends JpaRepository<NewsInfo, Long> {
    List<NewsInfo> findById(int id);
    List<NewsInfo> findByTitle(String title);
    List<NewsInfo> findByNewsId(String newsId);
}
