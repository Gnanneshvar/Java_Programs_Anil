package ClassesAndObjects;

public class CallingInstanceVariables {

    public static void main(String[] args) {
        InstanceVariables obj1 = new InstanceVariables();
        InstanceVariables obj2 = new InstanceVariables();
        obj1.a=40;
        obj1.print();
        System.out.println("2nd Object");
        obj2.print();
        obj1.as=50;
        System.out.println(InstanceVariables.as); //50
        System.out.println(obj2.as); // 50
        InstanceVariables.print1(); //  50
        //InstanceVariables.staticMethod();
    }
}
