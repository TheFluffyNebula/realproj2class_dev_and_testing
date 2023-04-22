package edu.guilford;

import java.util.Random;

public class Rational {
    //attributes
    private int numerator;
    private int denominator;

    //constructors
    public Rational() {
        Random rand = new Random();
        int numerator = 0;
        int denominator = 0;
        while (numerator == 0 && denominator == 0){
            numerator = rand.nextInt(100) + 1;
            denominator = rand.nextInt(100) + 1;
        }
        boolean numeratorNegative = rand.nextBoolean();
        boolean denominatorNegative = rand.nextBoolean();
        if (numeratorNegative) {
            numerator = -numerator;
        }
        if (denominatorNegative) {
            denominator = -denominator;
        }

    }

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero");
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //toString
    public String toString() {
        return numerator + "/" + denominator;
    }

    //getters and setters
    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    //methods
    public void negate() { //void since it doesn't return anything and just modifies existing elements
        numerator = -numerator;
    }

    public void invert() {
        int temp = numerator;
        numerator = denominator;
        denominator = temp;
    }

    public void toDouble(){
        double result = (double)numerator / (double)denominator;
        System.out.println(result);
    }

    public int euclideanAlgorithm(int a, int b) {
        int r = a % b;
        while (r != 0) {
            a = b;
            b = r;
            r = a % b;
        }
        return b;
    }

    public void reduce() {
        int gcd = euclideanAlgorithm(numerator, denominator);
        System.out.println("nonreduced" + numerator + "/" + denominator);
        numerator = numerator / gcd;
        denominator = denominator / gcd;
        System.out.println("reduced number: " + numerator + "/" + denominator);
    }

    public void add(Rational other) {
        int newNumerator = (numerator * other.denominator) + (other.numerator * denominator);
        int newDenominator = denominator * other.denominator;
        numerator = newNumerator;
        denominator = newDenominator;
        reduce();
    }


}
