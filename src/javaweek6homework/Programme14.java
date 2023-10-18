package javaweek6homework;

public class Programme14 {
    // Write a Java program to print the area and perimeter of a rectangle.//


    public static void main(String[] args) {
        // Test data
        double width = 5.6;
        double height = 8.5;

        //Calculate the area and perimeter//
        double area = width * height;
        double perimeter = 2 * (width + height);

        System.out.println("Width = " + width);
        System.out.println("height = " + height);
        System.out.println(" Area = " + area);
        System.out.println("Perimeter=" + perimeter);
    }
}
