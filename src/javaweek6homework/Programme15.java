package javaweek6homework;

public class Programme15 {
    //Write a Java program to swap two variables.//
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b =" + b);

        // Swapping logic
        int s1 = a;
        int s2 = b;
        a= s2;
        b= s1;
        System.out.println("After swapping");
        System.out.println("a=" + a);
        System.out.println("b= " + b);
    }

}
