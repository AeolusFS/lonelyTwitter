
/*
 * Tweet
 *
 * Version 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 AeolusFS, CMPUT301, University of Alberta - All Rights Reserved.  You may use, distribute, or modify this code under terms adn conditions of the Code of Student Behavior at University of Alberta.
 * you may find a copy of the license in this project.  Otherwise please contack zhai@ualberta.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;


/**
 * Created by AeolusFS on 9/12/17.
 */

/**
 * Represents a tweet.
 *
 * @author zhai
 * @version 1.5
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 *
 */

public abstract class Tweet {

    private String message;
    private Date date;

    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Constructs a tweet object.
     *
     * @param message tweet message
     * @param date tweet date
     */


    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public abstract Boolean isImportant();


    /**
     * Sets tweet message.
     *
     * @param message tweet message
     * @throws TweetTooLongException
     */

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    /**
     * Get the tweet message
     *
     * @return tweet message
     */

    public String getMessage(){
        return this.message;
    }

    /**
     * Get the date
     *
     * @return date
     */

    public Date getDate() {
        return date;
    }

    /**
     * Set the date
     *
     * @param date
     */

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}
