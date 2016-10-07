/**
 Copyright (C) 2016 Team 20, CMPUT301, University of Alberta - All Rights Reserved
 You may use, copy or distribute this code under terms and conditions of University of Alberta
 and Code of Student Behaviour.
 Please contact do@ualberta.ca for more details or questions.
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Tweetable is an interface to ensure that the user input meets the criteria for a tweet
 * Tweetable ensures tweets has a Message and a Date
 */

public interface Tweetable {

    public String getMessage();
    public Date getDate();
}
