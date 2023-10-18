package javaweek6homework;

public class Programme5 {
    /*Write a program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.*/
//Static method for addition//

    public static String add(double num1, double num2) {

        double result = num1 + num2;
        return num1 + "+ " + num2 + "=" + result;


    }


    //static method for Subtraction//
    public static String subtract(double num1, double num2) {
        double result = num1 - num2;
        return num1 + " - " + num2 + "=" + result;

    }

    //  Instance method for multiplication//
    public String multiply(double num1, double num2) {
        double result = num1 * num2;
        return num1 + "*" + num2 + " =" + result;
    }

    //Instance method for division//
    public String divide(double num1, double num2) {
        double result = num1 / num2;
        return num1 + " /" + num2 + "=" + result;
    }
    // calling the method//

    public static void main(String[] args) {
        Programme5 calculator = new Programme5();
        System.out.println(calculator.add(5.0,3.0));
        System.out.println();
        //using the instance methods






    }

}





