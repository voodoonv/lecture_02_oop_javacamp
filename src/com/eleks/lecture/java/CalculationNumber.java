package com.eleks.lecture.java;

public class CalculationNumber implements  Calculator{

    private int numberOfValue;
    private int begin;
    private int end;

    public CalculationNumber(int numberOfValue, int begin, int end) {
        this.numberOfValue = numberOfValue;
        this.begin = begin;
        this.end = end;
    }

    @Override
    public int calculate(Generator generator) {
        int sum = 0;
        int counter = 0;
        int x;
        while (counter < numberOfValue) {
            x = generator.next();
            if (x >= begin && x < end) {
                sum += x;
                counter++;
            }
        }
        return sum;
    }

}