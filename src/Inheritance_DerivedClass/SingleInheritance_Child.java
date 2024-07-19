package Inheritance_DerivedClass;

import Inheritance_BaseClass.SingleInheritance;

public class SingleInheritance_Child  extends SingleInheritance {

    public SingleInheritance_Child() {
        System.out.println("Inside Single Inheritance_Child");
    }

    public void childMethod1()
    {
        System.out.println("Child Method 1");
    }

    public void method1()
    {
        System.out.println("Inside Method1 of Parent Class Single Inheritance");
        System.out.println("Inside Single Heritance Child class Method1 Single Inheritance");
    }

    public int x;
    public String val = "GK";


//    public static void main(String[] args) {
//        SingleInheritance_Child obj = new SingleInheritance_Child();
//    }
}
