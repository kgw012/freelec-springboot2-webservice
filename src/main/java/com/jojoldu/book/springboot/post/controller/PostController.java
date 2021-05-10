package com.jojoldu.book.springboot.post.controller;

import com.jojoldu.book.springboot.post.model.PostSaveDto;
import com.jojoldu.book.springboot.post.model.SimpleResponse;
import com.jojoldu.book.springboot.post.service.PostSaveService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class PostController {

    private final PostSaveService postSaveService;

    @PostMapping("/api/v1/post")
    public ResponseEntity<SimpleResponse> savePost(@RequestBody PostSaveDto postSaveDto){
        Long id = this.postSaveService.savePost(postSaveDto);
        String message = "저장 성공!(id=" + id + ")";
        return ResponseEntity.ok(new SimpleResponse(true, message));
    }
}
