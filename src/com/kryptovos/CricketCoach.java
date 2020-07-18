package com.kryptovos;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    private String emailAdddress;
    private String team;

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
        System.out.println("CricketCoach: Hello from inside the setter fortuneservice");
        this.fortuneService = fortuneService;
    }

    public void setEmailAdddress(String emailAdddress) {
        System.out.println("CricketCoach: Hello from inside the setter for email");
        this.emailAdddress = emailAdddress;
    }

    public String getEmailAdddress(){
        return emailAdddress;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: Hello from inside the setter for team");
        this.team = team;
    }

    public String getTeam(){
        return team;
    }
}
