package javaweek6homework;

import java.util.Scanner;

public class Programme18 {
    //18. Write a Java program to print the sum (addition), multiply, subtract, divide and
    //remainder of two numbers.//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input first number");
        double num1 = sc.nextDouble();

        System.out.println("input second number");
        double num2 = sc.nextDouble();
        double sum = num1 + num2;
        double difference = num1 - num2;
        double multiply = num1 * num2;
        double division = num1 / num2;
        double remainder = num1 % num2;
        System.out.println(num1 + "+" + num2 + "=" + sum);
        System.out.println(num1 +"-"+ num2 +"=" + difference);
        System.out.println(num1 + "*"+ num2 + "=" + multiply);
        System.out.println(num1 + "/" + num2+ "=" + division);
        System.out.println(num1+ "%"+ num2+ "=" + remainder);
        sc.close();
    }

}
