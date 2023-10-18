package javaweek6homework;

public class Programme4 {
    //instance variable//
    int m = 40;
    String name = "Learning JAVA";
    //
    //static variable//
    static int k = 20;
    static String name1 = "My Java";

    public void myInstanceMethod() {
        System.out.println(m);
        System.out.println(name);
    }

    public static void myStaticMethod() {
        System.out.println(k);
        System.out.println(name1);
    }

    public static void main(String[] args) {
        Programme4 obj = new Programme4();
        obj.myInstanceMethod();
        myStaticMethod();

    }
}
