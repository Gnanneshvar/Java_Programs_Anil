package Constructors;

public class DefaultConstructor {

    public int a;
    public  String s="GK Gnaneshwar";

    static void call()
    {
        print();
//        print(10);
//        print(9,10);
//        print("Lokesh");
    }
    static void print()
    {
//        System.out.println(s);
    }

    static void print(int a)
    {
        System.out.println(a);
    }

    static final void print(int b,int a)
    {
        System.out.println(a);
    }

    static void print(String s)
    {
        System.out.println(s);
    }

    public DefaultConstructor()
    {
        System.out.println("Inside a DefaultConstructor");
    }
    public DefaultConstructor(int abc)
    {
        System.out.println("Inside Parametrized constructor::"+abc);
    }


}
