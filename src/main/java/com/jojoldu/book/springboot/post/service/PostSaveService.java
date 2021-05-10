package com.jojoldu.book.springboot.post.service;

import com.jojoldu.book.springboot.post.model.PostSaveDto;
import com.jojoldu.book.springboot.post.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PostSaveService {

    private final PostRepository postRepository;

    @Transactional
    public Long savePost(PostSaveDto postSaveDto){
        return postRepository.save(postSaveDto.toEntity()).getId();
    }
}
