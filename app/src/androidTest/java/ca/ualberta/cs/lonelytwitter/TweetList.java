package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.lang.IllegalArgumentException;

/**
 * Created by Jay on 2016-09-29.
 */
// New method to make test pass
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();
    public class IllegalArgumentException extends RuntimeException{};
    public TweetList(){

    }
    public boolean hasTweet (Tweet tweet){
        return tweets.contains(tweet);
    }

    public void addTweet (Tweet tweet){
        if (hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    public void delete (Tweet tweet){
        tweets.remove(tweet);
    }

    // Added for the lab 4 assignment

    public int getCount (){
        return tweets.size();
    }


    public Tweet getTweet(int index){
        return tweets.get(index);
    }
}
