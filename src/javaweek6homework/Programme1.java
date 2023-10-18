package javaweek6homework;

public class Programme1 {
    // Declare two instance variables.1.1//

    int a = 20;
    String name = "I like software testing";

    //Declare one instance method//
   // Program1 t1 = new Program1();

    // both instance variables into the print method//
    public void myMethod() {

        System.out.println(a);
        System.out.println(name);
    }

    public static void main(String[] args) {
        Programme1 t1 = new Programme1();
        t1.myMethod();

    }


}

