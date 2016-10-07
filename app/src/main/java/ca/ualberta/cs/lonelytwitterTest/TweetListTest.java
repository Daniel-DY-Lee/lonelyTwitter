/**
 Copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All Rights Reserved
 You may use, copy or distribute this code under terms and conditions of University of Alberta
 and Code of Student Behaviour.
 Please contact do@ualberta.ca for more details or questions.
 */

/**
 * This is the package for classes of CMPUT301 lab projects
 */

package ca.ualberta.cs.lonelytwitterTest;

import android.test.ActivityInstrumentationTestCase2;

import ca.ualberta.cs.lonelytwitter.NormalTweet;
import ca.ualberta.cs.lonelytwitter.Tweet;
import ca.ualberta.cs.lonelytwitter.TweetList;

/**
 * The type Tweet list test.
 */
// Constructor doesn't have a return type. You just create your object. Constructors must be public
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    /**
     * Instantiates a new Tweet list test.
     */
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }
    // Begin lab 4 lab exercise


    /**
     * Test add tweet.
     */
    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    // End lab 4 lab exercise

    /**
     * Test has tweet.
     */
    // Creating a new test, test must always start with a lowercase "t"
    public void testHasTweet (){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }

    /**
     * Test get count.
     */
    public void testGetCount () {
        TweetList list = new TweetList();
        list.getCount();
        assertFalse(list.getCount() < 0);
    }

    /**
     * Test delete.
     */
    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }

    /**
     * Test get tweet.
     */
    public void testGetTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("test");
        tweets.addTweet(tweet);
        for (int i = 0; i < tweets.getCount(); i++) {
            Tweet returnedTweet = tweets.getTweet(i);
            assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        }
        // The 0 is to "give it an index"
    }
}
