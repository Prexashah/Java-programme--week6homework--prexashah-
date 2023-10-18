package javaweek6homework;

import java.util.Scanner;

public class Programme17 {
    //17. Write a Java program to convert a decimal number to binary number.//
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the Decimal Value:");
        int decimal = Integer.parseInt(sc.nextLine());
        int binary = 0;
        int tempt = 1;
        int mod = 0;
        while (decimal > 0) {
            mod = decimal % 2;
            tempt = tempt * 10 + mod;
            decimal = decimal / 2;
        }
        while (tempt > 1) {
            mod = tempt % 10;
            binary = binary * 10 + mod;
            tempt = tempt / 10;

            System.out.println("Binary number=" + binary);
            sc.close();
        }
    }
}
