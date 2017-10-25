package com.eleks.lecture.java;

public class Main {
    public static void main(String[] args) {
        CalculationNumber calculationNumber = new CalculationNumber(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]));

        Generator generatorNum = new GenerationRandom();

        Generator generatorFibb = new GenerationFibb();

        for (int i : new int []{1, 2, 3, 5, 8, 13, 21}) {
            int next = generatorFibb.next();
            System.out.println(next);
            assert next == i;
        }

        System.out.println(calculationNumber.calculate(generatorNum));

    }
}
