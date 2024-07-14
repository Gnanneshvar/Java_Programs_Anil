package Operators;

public class IcrementDecrement {
    public static void main(String[] args) {
        int a=10;
        a = a+1;
        a+=1;
        a+=1; // a= a+1;
        System.out.println(a);
        System.out.println(a++);  // 10
        System.out.println(a--);  // 11
        System.out.println(a--);  // 10
        System.out.println(a++);  // 9
        System.out.println(++a);  // 11
        System.out.println(a++);  // 11
        System.out.println(a);    // 12
        System.out.println(++a);  // 13
        System.out.println(++a);  // 14
        System.out.println(--a);  // 13
        System.out.println(a--);  // 13
        System.out.println(a++);  // 12
        System.out.println(++a);  // 14
        System.out.println(a);    // 14
    }
}
