package com.example;


import com.example.models.Account;
import com.example.models.DirectMessage;
import com.example.models.Tweet;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TwitterController {

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String homePage(Model model) {

        //below is just for testing, in real world info would be from db
        Account account = new Account("JenniferC");

        account.getFollowing().add(new Account("Bob"));
        account.getFollowing().add(new Account("Alice"));
        account.getFollowing().add(new Account("Charlie"));
        account.getFollowers().add(new Account("Bob"));
        account.getFollowers().add(new Account("Alice"));
        account.getFollowers().add(new Account("Charlie"));

        account.getTweets().add(new Tweet("first tweet"));
        account.getTweets().add(new Tweet("second tweet"));
        account.getTweets().add(new Tweet("third tweet"));

        account.getdMs().add(new DirectMessage("JenniferC", "Bob", "first DM"));
        account.getdMs().add(new DirectMessage("JenniferC", "Alice", "second DM"));
        account.getdMs().add(new DirectMessage("JenniferC", "Charlie", "third DM"));

        List<Tweet> follwingTweets = new ArrayList<>();
        follwingTweets.add(new Tweet("this is just a test"));
        follwingTweets.add(new Tweet("this is also just a test"));
        follwingTweets.add(new Tweet("once againjust a test"));

        int followerCount = account.getFollowers().size();
        int followingCount = account.getFollowing().size();
        int tweetCount = account.getTweets().size();

        model.addAttribute("account", account);
        model.addAttribute("tweets", follwingTweets);
        model.addAttribute("followerCount", followerCount);
        model.addAttribute("followingCount", followingCount);
        model.addAttribute("tweetCount", tweetCount);

        return "home";
    }
}
