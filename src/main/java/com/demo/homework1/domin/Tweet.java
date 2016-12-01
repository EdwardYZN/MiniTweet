package com.demo.homework1.domin;

import org.springframework.stereotype.Component;

/**
 * Created by vagrant on 11/30/16.
 */
@Component
public class Tweet {

    private String username;
    private String content;

    public Tweet() {
        this.username = "Default_User";
        this.content = "Hello, MiniTweeter!";
    }

    public Tweet(String username, String content) {
        this.username = username;
        this.content = content;
    }

    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
    }
}
