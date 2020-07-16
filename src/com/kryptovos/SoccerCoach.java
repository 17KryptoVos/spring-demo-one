package com.kryptovos;

public class SoccerCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Score 15th goals";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
