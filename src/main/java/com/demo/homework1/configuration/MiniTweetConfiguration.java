package com.demo.homework1.configuration;

import com.demo.homework1.domin.Tweet;
import com.demo.homework1.domin.TweetPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by vagrant on 11/30/16.
 */

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.demo.homework1")
public class MiniTweetConfiguration {

    @Autowired
    private Tweet t;

    @Bean
    public TweetPrintService printTweet(){
        return new TweetPrintService(t);
    }
}

