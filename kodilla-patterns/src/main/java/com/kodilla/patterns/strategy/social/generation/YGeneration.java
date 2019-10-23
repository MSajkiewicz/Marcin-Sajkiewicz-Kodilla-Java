package com.kodilla.patterns.strategy.social.generation;

import com.kodilla.patterns.strategy.social.TwitterPublisher;
import com.kodilla.patterns.strategy.social.User;

public class YGeneration extends User {
    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
