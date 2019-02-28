package openapi.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsTextRepository  extends JpaRepository<NewsText, Long> {
    List<NewsText> findByNewsId(String newsId);
}
