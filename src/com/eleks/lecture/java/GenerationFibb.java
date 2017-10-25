package com.eleks.lecture.java;

public class GenerationFibb implements Generator{

    private int curr = 1;
    private int next = 1;

    @Override
    public int next() {
        int curr = this.curr;
        int next = this.next;
        this.curr = this.next;
        this.next = curr + next;

        return next;
    }
}