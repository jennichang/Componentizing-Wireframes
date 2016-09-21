package com.example.models;

/**
 * Created by jenniferchang on 9/21/16.
 */
public class Tweet {
    private String tweet;

    public Tweet(String tweet) {
        this.tweet = tweet;
    }

    public String getTweet() {
        return tweet;
    }

    public void setTweet(String tweet) {
        this.tweet = tweet;
    }
}
