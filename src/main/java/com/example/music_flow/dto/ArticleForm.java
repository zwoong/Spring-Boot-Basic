package com.example.music_flow.dto;


import com.example.music_flow.entity.Article;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor // 생성자
@NoArgsConstructor // 매개변수가 없는 생성자
@ToString // to string
@Setter
public class ArticleForm {

    private Long id;
    private String title;
    private String content;

    public Article toEntity() {
        return new Article(id, title, content);
    }

}
