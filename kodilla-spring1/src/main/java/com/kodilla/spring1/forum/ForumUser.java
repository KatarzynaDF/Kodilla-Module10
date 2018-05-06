package com.kodilla.spring1.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    private String username = "John Smith";

    public ForumUser() {
    }
    public String getUsername() {
        return this.username;
    }
}
