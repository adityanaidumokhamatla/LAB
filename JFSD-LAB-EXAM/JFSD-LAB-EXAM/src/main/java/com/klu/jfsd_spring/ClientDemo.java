package com.klu.jfsd_spring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        
        Employee employee = (Employee) context.getBean("employee");
        System.out.println("Employee Details: " + employee);

       
        Course course = (Course) context.getBean("course");
        System.out.println("Course Details: " + course);
        
    }
}

