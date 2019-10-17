package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasks().add("First task");
        board.getDoneList().getTasks().add("Second task");
        board.getInProgressList().getTasks().add("Third task");

        //Then
        Assert.assertEquals("[First task]", board.getToDoList().getTasks().toString());
        Assert.assertEquals("[Second task]", board.getDoneList().getTasks().toString());
        Assert.assertEquals("[Third task]", board.getInProgressList().getTasks().toString());
    }
}
