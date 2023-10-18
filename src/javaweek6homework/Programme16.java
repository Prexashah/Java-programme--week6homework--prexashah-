package javaweek6homework;

import java.util.Scanner;

public class Programme16 {
    //*16. Write a Java program to add two binary numbers.
    //Input Data:
    //Input first binary number: 10
    //Input second binary number: 11*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Input first binary number:");
        String binary1 = scan.nextLine();

        System.out.println("input second binary number");
        //convert binary strings to decimals//
        String binary2 = scan.nextLine();
        int decimal1 = Integer.parseInt(binary1,2);
        int decimal2 = Integer.parseInt(binary2,2);
        //Add the binary numbers
        int sum = decimal1 = decimal2;

        //Convert sum back to binary string
        String resultBinary = Integer.toBinaryString(sum);
        System.out.println("The sum of binary number is:" + resultBinary);
        scan.close();


    }

}
