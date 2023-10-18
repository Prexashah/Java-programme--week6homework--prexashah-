package javaweek6homework;

import java.util.Scanner;

public class Programme8 {
    //Write a program to calculate the area of a triangle.//
    public static void main(String[] args) {
        // we need base and height and area//
        int base;
        int height;

        Scanner tr1 = new Scanner(System.in);
        System.out.println("Enter the length of base triangle; ");
        base = tr1.nextInt();
        System.out.println("Enter the length of height of triangle:");
        height = tr1.nextInt();
        Programme8 obj = new Programme8();
        obj.triangleArea(base, height);

        tr1.close();


    }
    public void triangleArea(int base, int height) {
       int area = (base * height) / 2;
        System.out.println("The area of Triangle is:" + area);

    }

}


