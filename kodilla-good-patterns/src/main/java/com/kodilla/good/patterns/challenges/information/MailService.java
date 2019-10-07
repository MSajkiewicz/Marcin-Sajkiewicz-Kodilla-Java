package com.kodilla.good.patterns.challenges.information;

import com.kodilla.good.patterns.challenges.models.User;

public class MailService implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Mail send to " + user);

    }
}
