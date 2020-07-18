package com.kryptovos;

public class SadCoach implements Coach {
    // Define private field for the dependecy
    private FortuneService fortuneService;

    // Define constructor for dependecy injection
    public SadCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {

        return "Cry 1 hour";
    }

    @Override
    public String getDailyFortune() {

        // Use my fortuneService to get a fortune
        return fortuneService.getFortune();

    }
}
