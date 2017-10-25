package com.eleks.lecture.java;

import java.util.Random;

class GenerationRandom implements Generator{
    private Random random;

    public GenerationRandom(Random random) {
        this.random = random;
    }

    public GenerationRandom() {
        this(new Random());
    }

    @Override
    public int next() {
        return random.nextInt();
    }
}

