package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by AeolusFS on 9/12/17.
 */

/**
 * Represents a NormalTweet extends tweet
 */

public class NormalTweet extends Tweet {

    /**
     * Set NormalTweet message
     * @param message
     */

    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Set NormalTweet message and date
     * @param message
     * @param date
     */

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant(){
        return Boolean.FALSE;
    }

}
