package com.jojoldu.book.springboot.domain.post;

import com.jojoldu.book.springboot.domain.posts.Posts;
import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;

    @After
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void loadSavePostTest(){
        //given
        String title = "테스트 게시글";
        String content = "테스트 본문";
        String author = "author";

        postsRepository.save(Posts.builder()
                                    .title(title)
                                    .content(content)
                                    .author(author)
                                    .build());

        //when
        List<Posts> list = postsRepository.findAll();

        //then
        Posts posts = list.get(0);
        assertThat(posts.getTitle()).isEqualTo(title);
        assertThat(posts.getContent()).isEqualTo(content);
        assertThat(posts.getAuthor()).isEqualTo(author);
    }
}
