package com.kodilla.patterns.strategy.social.generation;

import com.kodilla.patterns.strategy.social.FacebookPublisher;
import com.kodilla.patterns.strategy.social.SocialPublisher;
import com.kodilla.patterns.strategy.social.User;

public class Millenials extends User {

    public Millenials(String name) {
        super(name);
        this.socialPublisher = new FacebookPublisher();
    }
}
