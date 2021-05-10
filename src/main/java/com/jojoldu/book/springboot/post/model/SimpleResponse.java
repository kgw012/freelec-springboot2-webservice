package com.jojoldu.book.springboot.post.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
public class SimpleResponse {

    private final boolean success;
    private final String message;
}
