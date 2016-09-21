package com.example.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jenniferchang on 9/21/16.
 */
public class Account {
    private String userName;
    private List<Account> following;
    private List<Account> followers;
    private List<Tweet> tweets;
    private List<DirectMessage> dMs;

    public Account(String userName){
        this();
        this.userName = userName;
    }

    public Account() {
        following = new ArrayList<>();
        followers = new ArrayList<>();
        tweets = new ArrayList<>();
        dMs = new ArrayList<>();
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<Account> getFollowing() {
        return following;
    }

    public void setFollowing(List<Account> following) {
        this.following = following;
    }

    public List<Account> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Account> followers) {
        this.followers = followers;
    }

    public List<Tweet> getTweets() {
        return tweets;
    }

    public void setTweets(List<Tweet> tweets) {
        this.tweets = tweets;
    }

    public List<DirectMessage> getdMs() {
        return dMs;
    }

    public void setdMs(List<DirectMessage> dMs) {
        this.dMs = dMs;
    }
}
