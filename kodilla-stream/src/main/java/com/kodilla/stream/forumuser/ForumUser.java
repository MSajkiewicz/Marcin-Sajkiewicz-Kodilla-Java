package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int uniqueID;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int createdPostsAmount;

    public ForumUser(final int uniqueID, final String userName,final char sex, final LocalDate dateOfBirth, final int createdPostsAmount) {
        this.uniqueID = uniqueID;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.createdPostsAmount = createdPostsAmount;
    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCreatedPostsAmount() {
        return createdPostsAmount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "uniqueID=" + uniqueID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", createdPostsAmount=" + createdPostsAmount +
                '}';
    }
}
