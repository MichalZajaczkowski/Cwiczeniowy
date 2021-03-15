package com.company;

public class Fraction {

    private int counter;
    private int denominator;
    private double value;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Fraction(){

    }

    public double Calculator(){
        return value = ((double) getCounter() / getDenominator());
    }
}


