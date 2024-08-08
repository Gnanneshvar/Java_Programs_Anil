package AbstractClasses;

public abstract class AbstractClass {
    abstract void test();
    public void nonabstractMethod()
    {
        System.out.println("Inside a Non Abstract Method");
    }
    public void nonabstractMethod(int a)
    {
        System.out.println("Inside a Non Abstract Method with single parameter");
    }

    static void staticMethod()
    {
        System.out.println("Inside a Static Method");
    }


}
