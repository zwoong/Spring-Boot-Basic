package com.example.music_flow.repository;
import com.example.music_flow.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query(value =
            "SELECT * " +
                    "FROM comment " +
                    "WHERE article_id = :articleId",
            nativeQuery = true)
    List<Comment> findByArticleId(@Param("articleId") Long articleId);
    List<Comment> findByNickname(String nickname);
}