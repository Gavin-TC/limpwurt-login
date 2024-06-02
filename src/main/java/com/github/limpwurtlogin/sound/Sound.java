package com.github.limpwurtlogin.sound;

import java.util.Random;

public enum Sound {
    LOGGED_IN("onthelasttimeofthisshit.wav");

    private final String resourceName;

    Sound(String resNam) {
        this(resNam, false);
    }

    Sound(String resNam, boolean streamTroll) {
        resourceName = resNam;
    }

    public String getResourceName() {
        return resourceName;
    }

    private static final Random random = new Random();
}
