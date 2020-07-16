package com.kryptovos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public CricketCoach() {
        System.out.println("Hello from inside the no-arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Hello from inside the setter");
        this.fortuneService = fortuneService;
    }
}
