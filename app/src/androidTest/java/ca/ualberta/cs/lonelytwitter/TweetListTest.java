package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase2;

import java.util.IllegalFormatCodePointException;

/**
 * Created by zhai on 10/10/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2{

    public TweetListTest() {
        super(LonelyTwitterActivity.class);
    }

    public void testAddTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        if (tweets.check_duplication(myTweet)){

            try {
                throw new IllegalArgumentException("Adding Duplicate Tweet. ");
            }
            catch(IllegalArgumentException e){
                boolean ifdup = true;
                assertTrue(ifdup);
            }
        }

        else {

            tweets.addTweet(myTweet);

            assertTrue(tweets.hasTweet(myTweet));
        }
    }

    public void testDeleteTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        tweets.addTweet(myTweet);

        tweets.deleteTweet(myTweet);

        assertFalse(tweets.hasTweet(myTweet));
    }

    public void testHasTweet() {

        TweetList tweets = new TweetList();

        Tweet myTweet = new NormalTweet("my tweet");

        assertFalse(tweets.hasTweet(myTweet));

        tweets.addTweet(myTweet);

        assertTrue(tweets.hasTweet(myTweet));
    }


    public void testGetTweet(){

        // getTweet method will take an index and will return the tweet at that index

        //HINT:

        TweetList tweets = new TweetList();

        NormalTweet myTweet = new NormalTweet("my tweet");
        tweets.addTweet(myTweet);
        Tweet returnedTweet = tweets.getTweet(0);

        assertEquals(returnedTweet.getMessage(),myTweet.getMessage());
        assertEquals(returnedTweet.getDate(),myTweet.getDate());
    }

    public void testGetCount(){

        TweetList tweets = new TweetList();

        NormalTweet myTweet1 = new NormalTweet("11");
        NormalTweet myTweet2 = new NormalTweet("22");
        tweets.addTweet(myTweet1);
        tweets.addTweet(myTweet2);

        int Count = tweets.getCount();

        assertEquals(Count, 2);
    }
}
