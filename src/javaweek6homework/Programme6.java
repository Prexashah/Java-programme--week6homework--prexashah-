package javaweek6homework;

import java.util.Scanner;

public class Programme6 {
    //Write a program to enter any radius value of the circle and find out the
//area.(Formula of Area A=PI*r*r).
    // are = PI*r*r//
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);
        System.out.println(" Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();

        area = Math.PI * radius * radius;
        System.out.println(" Area of the Circle is  " + area);


    }
}

