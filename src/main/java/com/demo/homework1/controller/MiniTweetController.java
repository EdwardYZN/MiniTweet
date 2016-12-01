package com.demo.homework1.controller;

import com.demo.homework1.domin.Tweet;
import com.demo.homework1.domin.TweetPrintService;
import com.demo.homework1.domin.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.temporal.Temporal;

/**
 * Created by vagrant on 11/30/16.
 */

@RestController
public class MiniTweetController {

    @Autowired
    private User user;
    @Autowired
    private TweetPrintService svc;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() { return "Welcome to Mini Tweeter!"; }

    @RequestMapping(value = "/{user}/{content}", method = RequestMethod.GET)
    public Tweet getTweet(@PathVariable String user, @PathVariable String content) { return new Tweet(user,content); }

    @RequestMapping(value = "/sayHi/{name}/{greeting}", method = RequestMethod.GET)
    public String greet(@PathVariable String name, @PathVariable String greeting){
        return user.sayHi(name, greeting);
    }

    @RequestMapping(value = "/print/{postfix}", method = RequestMethod.GET)
    public String print(@PathVariable String postfix){
        return svc.print() + " - " + postfix;
    }
}
