package Strings;

public class Comparison_String {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = new String("hello");
        String str4 = new String("hgkgnanes");
        if(str1.equals(str2))
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");

        if(str2.equalsIgnoreCase(str3))
            System.out.println("Strings str2 and str3 are equal");
        else
            System.out.println("Strings str2 and str3 are not equal");
        //ComparTo returns 0 if both the strings are equal
        // return -ve when first string is smallar than the second sting (based on the ascci values)
        // return +ve when first string is greater than the second string (based on the ascci values)
        System.out.println("Str1 and Str2::"+str1.compareTo(str2)); // str1 ="Hello" str2 = "Hello"
        System.out.println("str2 an Str3::"+str2.compareTo(str3)); // str2 = "Hello" str3 = "hello"
        System.out.println("str3 and str2::"+str3.compareTo(str2));
        System.out.println("str3 and str4::"+str3.compareTo(str4));
        char ch = 'h',ch1='H';
        int small = ch,capital=ch1;
        int difference = small-capital;

        System.out.println("Small Character::"+small);
        System.out.println("Capital Character::"+capital);
        System.out.println("Difference between small and capital::"+difference);
    }
}
