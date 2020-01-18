package com.kodilla.hibernate.manytomany.facade;


public class ManyToManyFacadeException extends Exception {


    public static final String ERR_SEARCH_EMPLOYEE_ERROR = "Employees not searched" ;
    public static final String ERR_SEARCH_COMPANY_ERROR = "Companies not searched";

    public ManyToManyFacadeException(String message) {
        super(message);
    }
}
