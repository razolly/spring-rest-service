package com.example.springrestservice.entity;

import lombok.Data;

@Data
public class Quote {

    private long id;
    private String content;

    public Quote(long id, String content) {
        this.id = id;
        this.content = content;
    }
}
