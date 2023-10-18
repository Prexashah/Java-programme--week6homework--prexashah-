package javaweek6homework;

public class Programme2 {
    //Declare two static variables//
    static int a = 50;
    static String name = "I like software testing";

    //Declare the static method//
    public static void myStaticMethod() {
        System.out.println(Programme2.a);
        System.out.println(name);
    }
//declare the main method//
    public static void main(String[] args) {
        myStaticMethod();
    }
}
