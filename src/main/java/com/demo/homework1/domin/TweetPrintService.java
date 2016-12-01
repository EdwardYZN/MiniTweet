package com.demo.homework1.domin;

/**
 * Created by vagrant on 11/30/16.
 */
public class TweetPrintService {

    private Tweet tweet;

    public TweetPrintService(Tweet tweet){
        this.tweet=tweet;
    }

    public String print(){
        return "Printing tweet from : " + tweet.getUsername() + " : " + tweet.getContent();
    }
}
