package javaweek6homework;

import java.util.Scanner;

public class Programme7 {
    //Write a program to insert any temperature value in degree Fahrenheit and
    //convert to degree Celsius ((F − 32) × 5/9 = 0°C).
    public static void main(String[] args) {
        double celsius = 0.0;
        double fahrenheit = 0.0;
        Scanner tempt = new Scanner(System.in);
        System.out.println(" Enter the celsius value");
        celsius = tempt.nextDouble();
        // f = 5.0/9.0 * C + 32.0//
        fahrenheit = 5.0 / 9.0 * celsius + 32.0;
        System.out.println(" The fahrenheit value is: " + fahrenheit);
        tempt.close();
    }
}
