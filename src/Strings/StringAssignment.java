package Strings;

public class StringAssignment {
    public static void main(String[] args) {
        String str1 = "Selenium";  // Literal
        String str2 = "Selenium";
        String str3 = new String("Selenium"); // New keyword
        char ch[]={'S','e','l','e','n','i','u','m'};
        String str4 = new String(ch);// new character Array
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        if(str1==str2)
        {
            System.out.println("Str1 and Str2 are the same");
        }
        if(str1==str3)
        {
            System.out.println("Str1 and Str3 are the same");
        }
        else
        {
            System.out.println("Str1 and Str3 are not same");
        }
        if(str1==str4)
        {
            System.out.println("Str1 and Str4 are the same");
        }
        else
        {
            System.out.println("Str1 and Str4 are not same");
        }
        if(str3==str4)
        {
            System.out.println("Str3 and Str4 are the same");
        }
        else {
            System.out.println("Str3 and Str4 are not same");
        }

    }
}
