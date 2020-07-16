package com.kryptovos;

public class SoccerCoach implements Coach {

    // Define private field for the dependecy
    private FortuneService fortuneService;

    // No arg constructor
    public SoccerCoach() {
    }

    // Define constructor for dependecy injection
    public SoccerCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Score 15th goals";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
