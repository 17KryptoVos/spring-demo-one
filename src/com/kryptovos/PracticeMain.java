package com.kryptovos;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeMain {
    public static void main(String[] args) {

        // load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach theSadCoach = context.getBean("TheSadCoach", Coach.class);

        // call methods on the bean
        System.out.println(theSadCoach.getDailyWorkout());
        System.out.println(theSadCoach.getDailyFortune());

        // close the context
        context.close();


    }
}
