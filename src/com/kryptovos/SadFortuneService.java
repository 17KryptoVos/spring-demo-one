package com.kryptovos;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class SadFortuneService implements FortuneService {

    private final String[] FORTUNES = {"Bad weather", "Stupid school", "Annoying music", "Lame stuff", "Stuff is boring"};
    private Random rand;

    {
        try {
            rand = SecureRandom.getInstanceStrong();
            System.out.println("Used algorithm --> " + ((SecureRandom) rand).getAlgorithm());
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

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
        return rand.nextInt(FORTUNES.length);
    }
}
