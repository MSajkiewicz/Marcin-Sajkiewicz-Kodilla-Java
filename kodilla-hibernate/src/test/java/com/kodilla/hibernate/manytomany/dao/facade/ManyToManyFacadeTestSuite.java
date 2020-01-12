package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.facade.ManyToManyFacade;
import com.kodilla.hibernate.manytomany.facade.ManyToManyFacadeException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyToManyFacadeTestSuite {
    @Autowired
    ManyToManyFacade manyToManyFacade;

    @Before
    public void createData() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        manyToManyFacade.save(softwareMachine);
        manyToManyFacade.save(dataMaesters);
        manyToManyFacade.save(greyMatter);
    }

    @Test
    public void facadeSearchCompaniesByThreeCharsOfNameTest() {
        //When
        List<Company> searchedCompaniesByThreeChars = new ArrayList<>();
        try {
            searchedCompaniesByThreeChars = manyToManyFacade.searchCompaniesByThreeCharsOfName("sof");
        } catch (ManyToManyFacadeException e) {
            e.printStackTrace();
        }

        //Then
        Assert.assertEquals(searchedCompaniesByThreeChars.size(), 1);
        Assert.assertEquals(searchedCompaniesByThreeChars.get(0).getName(), "Software Machine");
    }
    @Test
    public void facadeSearchCompaniesByPhrasePartTest() {
        //When
        List<Company> searchedCompaniesByPhrasePart = new ArrayList<>();
        try {
            searchedCompaniesByPhrasePart = manyToManyFacade.searchCompaniesByPhrasePart("chi");
        } catch (ManyToManyFacadeException e) {
            e.printStackTrace();
        }

        //Then
        Assert.assertEquals(searchedCompaniesByPhrasePart.size(), 1);
        Assert.assertEquals(searchedCompaniesByPhrasePart.get(0).getName(), "Software Machine");
    }
    @Test
    public void facadeSearchEmployeesByLastName() {
        //When
        List<Employee> searchedEmployeesByLastName = new ArrayList<>();
        try {
            searchedEmployeesByLastName = manyToManyFacade.searchEmployeesByLastName("Kovalsky");
        } catch (ManyToManyFacadeException e) {
            e.printStackTrace();
        }

        //Then
        Assert.assertEquals(searchedEmployeesByLastName.size(), 1);
        Assert.assertEquals(searchedEmployeesByLastName.get(0).getLastname(), "Kovalsky");
    }

    @Test
    public void facadeSearchEmployeesByPhrasePart() {
        //When
        List<Employee> searchedEmployeesByPhrasePart = new ArrayList<>();
        try {
            searchedEmployeesByPhrasePart = manyToManyFacade.searchEmployeesByPhrasePart("lsk");
        } catch (ManyToManyFacadeException e) {
            e.printStackTrace();
        }

        //Then
        Assert.assertEquals(searchedEmployeesByPhrasePart.size(), 1);
        Assert.assertEquals(searchedEmployeesByPhrasePart.get(0).getLastname(), "Kovalsky");
    }


}
