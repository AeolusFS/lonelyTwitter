package ca.ualberta.cs.lonelytwitter;
import java.util.ArrayList;


/**
 * Created by zhai on 10/10/17.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    // add tweet to a List of tweets
    public void addTweet(Tweet tweet){

        tweets.add(tweet);

    }

    // delete tweet from a list of tweets
    public void deleteTweet(Tweet tweet){

        tweets.remove(tweet);

    }

    // check if a list of tweets has the specified tweet
    // if it does, return true; otherwise return false
    public boolean hasTweet(Tweet tweet) {

        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index){
         return tweets.get(index);
    }

    public boolean check_duplication (Tweet tweet){

        for (Tweet new_tweet: tweets){
            if (new_tweet.getMessage().equals(tweet.getMessage())){
                return true;
            }
        }

        return false;
    }

    public int getCount(){
        return tweets.size();
    }

}
