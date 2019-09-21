package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> forumUsersList = new ArrayList<>();

    public Forum(){
            forumUsersList.add(new ForumUser(0001, "Marcin", 'M', LocalDate.of(1991, 9, 28), 2));
            forumUsersList.add(new ForumUser(0002, "Adam", 'M', LocalDate.of(2000, 5, 21), 8));
            forumUsersList.add(new ForumUser(0003, "Sylwia", 'F', LocalDate.of(1991, 7, 23), 15));
            forumUsersList.add(new ForumUser(0004, "Ola", 'F', LocalDate.of(1982, 1, 11), 4));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsersList);
    }
}
