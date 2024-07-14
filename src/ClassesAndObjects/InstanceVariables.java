package ClassesAndObjects;

public class InstanceVariables {
    int a=10;
    float b=0.8f;
    char c='A';
    boolean status=true;
    static int as=27;

    void print()
    {
        System.out.println("Integer::"+a);
        System.out.println("Float ::"+b);
        System.out.println("Char::"+c);
        System.out.println("Boolean::"+status);
        System.out.println("Static Variable inside non static::"+as);
        //test();
        //print1();
    }

    void test()
    {
        System.out.println("Inside test method");
    }

    public static void print1()
    {
        System.out.println("Static Variable::"+as);
        staticMethod();
    }

    static void staticMethod()
    {
        System.out.println("Inside static method");

    }
}
