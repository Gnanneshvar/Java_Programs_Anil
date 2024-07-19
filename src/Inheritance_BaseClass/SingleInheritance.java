package Inheritance_BaseClass;

public class SingleInheritance {

    int a;
    String str = "Hello";
    protected SingleInheritance()
    {
        System.out.println("Inside Single Inheritance Class");
    }

    public void method1()
    //public void method1()
    {
        System.out.println("Inside Method1 of Parent Class");
    }
    void method2()
    {
        System.out.println("Inside Method2 of Parent Class");
    }
    private void method3()
    {
        System.out.println("Inside Method3 of Parent Class");
    }
    protected void method4()
    {
        System.out.println("Inside method 4 of Parent Class");
    }
}
