package Constructors;

public class PrivateConstructor {

    private int a;
    private String str;
    private PrivateConstructor()
    {

    }

    public static void test()
    {
        PrivateConstructor obj =  new PrivateConstructor();
        obj.a=10;
        obj.str="hello";
        System.out.println(obj.a);
        System.out.println(obj.str);
    }
}
