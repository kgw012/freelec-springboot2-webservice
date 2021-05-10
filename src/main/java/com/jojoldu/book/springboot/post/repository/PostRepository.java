package com.jojoldu.book.springboot.post.repository;

import com.jojoldu.book.springboot.post.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
