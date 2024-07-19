package Inheritance_DerivedClass;

public class MultipleInheritance extends SingleInheritance_Child {
    int x;
    String val = "Gnaneshwar";

    MultipleInheritance()
    {
        super();
        System.out.println("Inside MultipleInheritance Class");
    }

    public void method1()
    {
        System.out.println(x);
        System.out.println("Inside Method1 of Parent Class");
        System.out.println("Inside Single Heritance Child class Method1");
        System.out.println("Inside MultipleInheritance class Method1");
        super.method1();
        System.out.println(super.val);
        this.x = 30;
        super.x = 40;
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.method4();
        obj.method1();
        obj.childMethod1();
        System.out.println(obj.val);
    }
}
