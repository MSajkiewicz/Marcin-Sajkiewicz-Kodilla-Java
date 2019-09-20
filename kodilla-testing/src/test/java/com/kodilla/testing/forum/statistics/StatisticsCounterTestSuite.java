package com.kodilla.testing.forum.statistics;
import org.junit.Test;
import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsCounterTestSuite {

    //Test for postAmount=0
    @Test
    public void testCalculateAdvStatisticsForPostAmount0(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<4; i++) { names.add("Adam"); }

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(0);
        when(statistics.commentsCount()).thenReturn(400);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(0.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(0.0, statisticsCounter.getCommentsPerPostAverage(), 0);
    }

    //Test for postAmount=1000
    @Test
    public void testCalculateAdvStatisticsForPostAmountEquals1000(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<4; i++) { names.add("Adam"); }

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(2000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(250.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(500.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(2.0, statisticsCounter.getCommentsPerPostAverage(), 0);
    }

    //Test for commentsAmount=0
    @Test
    public void testCalculateAdvStatisticsForCommentAmountEquals0(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<4; i++) { names.add("Adam"); }

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(0);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(250.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(0.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(0.0, statisticsCounter.getCommentsPerPostAverage(), 0);
    }
    //Test for commentsAmount<postsAmount
    @Test
    public void testCalculateAdvStatisticsForCommentAmountLowerThenPostsAmount(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<4; i++) { names.add("Adam"); }

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(100);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(250.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(25.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(0.1, statisticsCounter.getCommentsPerPostAverage(), 0);
    }
    //Test for commentsAmount>postsAmount
    @Test
    public void testCalculateAdvStatisticsForCommentAmountBiggerThenPostsAmount(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<4; i++) { names.add("Adam"); }

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(250.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(2500.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(10.0, statisticsCounter.getCommentsPerPostAverage(), 0);
    }
    //Test for usersAmount = 0
    @Test
    public void testCalculateAdvStatisticsForUserAmountEquals0(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(0.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(0.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(0.0, statisticsCounter.getCommentsPerPostAverage(), 0);
    }
    //Test for usersAmount = 100
    @Test
    public void testCalculateAdvStatisticsForUserAmountEquals100(){
        //Given
        Statistics statistics = mock(Statistics.class);

        ArrayList<String> names = new ArrayList<>();
        for(int i=0; i<100; i++) { names.add("Adam"); }

        when(statistics.usersNames()).thenReturn(names);
        when(statistics.postsCount()).thenReturn(1000);
        when(statistics.commentsCount()).thenReturn(10000);

        StatisticsCounter statisticsCounter = new StatisticsCounter();

        //When
        statisticsCounter.calculateAdvStatistics(statistics);

        //Then
        assertEquals(10.0, statisticsCounter.getPostsPerUserAverage(), 0);
        assertEquals(100.0, statisticsCounter.getCommentsPerUserAverage(), 0);
        assertEquals(10.0, statisticsCounter.getCommentsPerPostAverage(), 0);
    }


}
