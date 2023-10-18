package javaweek6homework;

import java.util.Scanner;

public class Programme13 {
    //13. Write a Java program that takes three numbers as input to calculate and
    //print the average of the numbers.//
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);
        // user to enter three numbers
        System.out.println("Enter the first number");
        double number1 = calculator.nextDouble();
        System.out.println("Enter second number");
        double number2 = calculator.nextDouble();
        System.out.println("Enter third number");
        double number3 = calculator.nextDouble();
        // Calculate the average//
        double average = (number1 + number2 + number3) / 3;
        //Result//
        System.out.println("The average of the three numbers is:" + average);

        calculator.close();
    }

}
