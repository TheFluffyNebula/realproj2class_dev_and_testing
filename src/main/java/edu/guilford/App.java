package edu.guilford;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Rational zerothNumber = new Rational();
        System.out.println("zerothNumber (random constructor) "+zerothNumber);

        Rational firstNumber = new Rational(16, 64);
        System.out.println("firstNumber "+firstNumber);
        firstNumber.reduce();
        firstNumber.negate();
        System.out.println("negated number "+firstNumber);
        firstNumber.invert();
        System.out.println("inverted number "+firstNumber);
        System.out.print("toDouble");
        firstNumber.toDouble();
        //firstNumber.euclideanAlgorithm(12, 8);
        
        Rational secondNumber = new Rational(3, 4);
        Rational thirdNumber = new Rational(5, 6);
        secondNumber.add(thirdNumber);

    }
}
