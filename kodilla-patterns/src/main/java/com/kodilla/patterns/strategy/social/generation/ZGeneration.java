package com.kodilla.patterns.strategy.social.generation;

import com.kodilla.patterns.strategy.social.SnapchatPublisher;
import com.kodilla.patterns.strategy.social.User;

public class ZGeneration extends User {
    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
