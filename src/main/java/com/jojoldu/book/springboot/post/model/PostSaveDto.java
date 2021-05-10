package com.jojoldu.book.springboot.post.model;

import com.jojoldu.book.springboot.post.domain.Post;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PostSaveDto {

    private Long id;
    private String title;
    private String content;
    private String author;

    @Builder
    public PostSaveDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Post toEntity(){
        return Post.builder()
                    .title(title)
                    .content(content)
                    .author(author)
                    .build();
    }
}
