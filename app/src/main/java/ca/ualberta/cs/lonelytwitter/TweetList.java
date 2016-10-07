/**
 Copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All Rights Reserved
 You may use, copy or distribute this code under terms and conditions of University of Alberta
 and Code of Student Behaviour.
 Please contact do@ualberta.ca for more details or questions.
 */


package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.lang.IllegalArgumentException;

/**
 * The type Tweet list.
 */
// New method to make test pass
public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    /**
     * @Throws IllegalArgumentException
     * Throws Exception when conditions are violated
     */
    public class IllegalArgumentException extends RuntimeException{};

    /**
     * Instantiates a new Tweet list.
     */
    public TweetList(){

    }

    /**
     * @param tweet the tweet: the Tweet that will be checked to see if it is in the file
     * @return the boolean: returns True or False depending on whether the Tweet is already in the
     * file or not
     */
    public boolean hasTweet (Tweet tweet){
        return tweets.contains(tweet);
    }

    /**
     * @param tweet the tweet: is the Tweet to be added
     */
    public void addTweet (Tweet tweet){
        if (hasTweet(tweet)){
            throw new IllegalArgumentException();
        }
        else {
            tweets.add(tweet);
        }
    }

    /**
     * @param tweet the tweet: is the Tweet to be deleted
     */
    public void delete (Tweet tweet){
        tweets.remove(tweet);
    }

    // Added for the lab 4 assignment

    /**
     * @return the int: is the size, returns number of tweets when this class is called
     */
    public int getCount (){
        return tweets.size();
    }


    /**
     * @param index the index: index of a Tweet
     * @return the tweet: the returned value is a tweet at the index specified by the parameter
     * above
     */
    public Tweet getTweet(int index){
        return tweets.get(index);
    }
}
