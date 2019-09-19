package com.kodilla.testing.forum.statistics;


public class StatisticsCounter {
    Statistics statistics;

    int usersAmount=0;
    int postAmount=0;
    int commentsAmount=0;
    double postsPerUserAverage=0.0;
    double commentsPerUserAverage=0.0;
    double commentsPerPostAverage=0.0;


    public StatisticsCounter(Statistics statistics){
        this.statistics = statistics;
    }

    public double getPostsPerUserAverage() {
        return postsPerUserAverage;
    }

    public double getCommentsPerUserAverage() {
        return commentsPerUserAverage;
    }

    public double getCommentsPerPostAverage() {
        return commentsPerPostAverage;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersAmount = statistics.usersNames().size();
        postAmount = statistics.postsCount();
        commentsAmount = statistics.commentsCount();

        if (usersAmount == 0 || postAmount == 0) {
            postsPerUserAverage = 0;
            commentsPerUserAverage = 0;
            commentsPerPostAverage = 0;
        } else {
            double doubleUsersAmount=(double) usersAmount;
            double doublePostAmount=(double) postAmount;
            double doubleCommentsAmount=(double) commentsAmount;

            postsPerUserAverage = doublePostAmount / doubleUsersAmount;
            commentsPerUserAverage = doubleCommentsAmount / doubleUsersAmount;
            commentsPerPostAverage = doubleCommentsAmount / doublePostAmount;
        }
    }

    public void showStatistics(){
        System.out.println(usersAmount);
        System.out.println(postAmount);
        System.out.println(commentsAmount);
        System.out.println(postsPerUserAverage);
        System.out.println(commentsPerUserAverage);
        System.out.println(commentsPerPostAverage);
    }

}
