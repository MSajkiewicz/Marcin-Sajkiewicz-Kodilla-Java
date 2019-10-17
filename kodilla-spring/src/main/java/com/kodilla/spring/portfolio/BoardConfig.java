package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("list1st")
    public TaskList list1st;
    @Autowired
    @Qualifier("list2nd")
    public TaskList list2nd;
    @Autowired
    @Qualifier("list3rd")
    public TaskList list3rd;


    @Bean
    public Board getBoard(){
        return new Board(list1st, list2nd, list3rd);
    }

    @Bean(name = "list1st")
    public TaskList getTaskList1st() {
        return new TaskList();
    }
    @Bean(name = "list2nd")
    public TaskList getTaskList2nd() {
        return new TaskList();
    }
    @Bean(name = "list3rd")
    public TaskList getTaskList3rd() {
        return new TaskList();
    }


}
