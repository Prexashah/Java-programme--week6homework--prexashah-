package javaweek6homework;

public class Programme3 {
    //Declare one instance and one static variable//
    static int x = 30;
    String name = "JAVA";

    //Declare one instance method//
    public void m2() {
        System.out.println(x);
        System.out.println(name);
    }
    public static void m1(){
        Programme3 s1 = new Programme3();
        System.out.println(s1.name);
        System.out.println(x);

    }




    public static void main(String[] args) {
        Programme3 s1 = new Programme3();
        m1();
      s1.m2();
    }
}

