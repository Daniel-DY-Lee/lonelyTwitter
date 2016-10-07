/**
 Copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All Rights Reserved
 You may use, copy or distribute this code under terms and conditions of University of Alberta
 and Code of Student Behaviour.
 Please contact do@ualberta.ca for more details or questions.
 */

// @see Tweet

package ca.ualberta.cs.lonelytwitter;

/**
 * The type Important tweet.
 */
public class ImportantTweet extends Tweet{

    /**
     * Instantiates a new Important tweet.
     *
     * @param message the message
     */
    public ImportantTweet(String message){
        super(message);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.TRUE;
    }


}
