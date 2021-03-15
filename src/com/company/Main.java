package com.company;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        numberOfCalculations2();
    }

    private static void numberOfCalculations2() {
        int numberOfCircuitsLoop = 5;
        Fraction fraction2 = new Fraction();
        for (int i = 0; i <= numberOfCircuitsLoop; i++) {
            fraction2.setCounter(randMathRandom());
            fraction2.setDenominator(randMathRandom());
            System.out.println(df2.format(fraction2.Calculator()));
        }
    }

    private static DecimalFormat df2 = new DecimalFormat("#.##");

    private static int randMathRandom(){
        LinkedList m = new LinkedList();
        Random generator = new Random();
        int re = generator.nextInt();
        for(int i=0; i<1; i++) {
            m.add(generator.nextDouble());
        }
        return re;
    }
}