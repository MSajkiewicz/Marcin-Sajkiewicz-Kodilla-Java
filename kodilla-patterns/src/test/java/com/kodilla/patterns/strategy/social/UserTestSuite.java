package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.generation.Millenials;
import com.kodilla.patterns.strategy.social.generation.YGeneration;
import com.kodilla.patterns.strategy.social.generation.ZGeneration;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("User1");
        User user2 = new YGeneration("User2");
        User user3 = new ZGeneration("User3");

        //When
        //Then
        Assert.assertEquals("Facebook" ,user1.sharePost());
        Assert.assertEquals("Twitter" ,user2.sharePost());
        Assert.assertEquals("Snapchat" ,user3.sharePost());

    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user4 = new Millenials("User4");

        //When
        user4.setSocialPublisher(new TwitterPublisher());

        //Then
        Assert.assertEquals("Twitter", user4.sharePost());
    }
}
