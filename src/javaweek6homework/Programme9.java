package javaweek6homework;

import java.util.Scanner;

public class Programme9 {
    //Write a program to convert the upper case to lower case.//
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String s = null;
        System.out.println("Enter String");
        s = user.nextLine();
        convertToLowercase(s);
        user.close();

    }
    public static void convertToLowercase(String s){
     String result=   s.toLowerCase();
        System.out.println(" Lowercase sentence: " + result);

    }


    }



