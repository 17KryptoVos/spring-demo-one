package com.kryptovos;

public class MyApp {

    public static void main(String[] args) {

        // create the object
        Coach theFirstCoach = new BaseballCoach();
        Coach theSecondCoach = new SoccerCoach();

        // use the object
        System.out.println(theFirstCoach.getDailyWorkout());
        System.out.println(theSecondCoach.getDailyWorkout());
    }
}
