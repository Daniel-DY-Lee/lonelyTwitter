package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Jay on 2016-09-29.
 */
// Constructor doesn't have a return type. You just create your object. Constructors must be public
public class TweetListTest extends ActivityInstrumentationTestCase2 {
    public TweetListTest(){
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }
    // Begin lab 4 lab exercise


    public void testAddTweet(){
        TweetList tweets = new TweetList();
        Tweet tweet = new NormalTweet("adding tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }
    // End lab 4 lab exercise

    // Creating a new test, test must always start with a lowercase "t"
    public void testHasTweet (){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        assertTrue(list.hasTweet(tweet));
    }
    public void testGetCount () {
        TweetList list = new TweetList();
        list.getCount();
        assertFalse(list.getCount() < 0);
    }
    public void testDelete(){
        TweetList list = new TweetList();
        Tweet tweet = new NormalTweet("test");
        list.addTweet(tweet);
        list.delete(tweet);
        assertFalse(list.hasTweet(tweet));
    }
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
