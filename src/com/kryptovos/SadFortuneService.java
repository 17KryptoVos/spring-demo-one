package com.kryptovos;

import java.util.ArrayList;
import java.util.Random;

public class SadFortuneService implements FortuneService {

    private final String[] FORTUNES = {"Bad weather", "Stupid school", "Annoying music", "Lame stuff", "Stuff is boring"};

    @Override
    public String getFortune() {
        return getThreeRandomsFortuns().toString();
    }

    private ArrayList<String> getThreeRandomsFortuns() {
        ArrayList<String> arrayOfFortunes = new ArrayList<>();
        arrayOfFortunes.add(FORTUNES[getRandomIndex()]);
        arrayOfFortunes.add(FORTUNES[getRandomIndex()]);
        arrayOfFortunes.add(FORTUNES[getRandomIndex()]);
        return arrayOfFortunes;
    }

    private int getRandomIndex() {
        Random random = new Random();
        return random.nextInt(FORTUNES.length);
    }
}
