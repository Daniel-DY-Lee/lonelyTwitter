/**
 Copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All Rights Reserved
 You may use, copy or distribute this code under terms and conditions of University of Alberta
 and Code of Student Behaviour.
 Please contact do@ualberta.ca for more details or questions.
 */

// @see Tweet

package ca.ualberta.cs.lonelytwitter;

/**
 * The type Normal tweet.
 */
public class NormalTweet extends Tweet {

    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.FALSE;
    }
}
