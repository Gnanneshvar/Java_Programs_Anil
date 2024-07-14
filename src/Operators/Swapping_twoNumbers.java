package Operators;

public class Swapping_twoNumbers {
    public static void main(String[] args) {
        int a = 10,b=20,temp; //
        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping two numbers:");
        System.out.println(a + "   " + b);

        // without using third variable
        a=10;b=20;
        System.out.println("After swapping two numbers:");
        a=a+b; // b = a+b;
        b=a-b; // a = b-a;
        a=a-b; // b=  b-a;
        System.out.println("After swapping two numbers:");
        System.out.println(a + "   " + b);
    }
}
