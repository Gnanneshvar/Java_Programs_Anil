package Strings;

public class StringComparison {
    public static void main(String[] args) {
        char ch = 'a';
        String str = "a";
        String str1 = "GK Gnaneshwar";
        String str5 = "GK";
        String str2 = "Sahiti Chagarlamudi";
        String str3 = "Surya";
        String[] str4 = {"GK","Gnaneshwar GK","Gnani GK","GKG"};
        //contains returns-> boolean
        //StartsWith returns -> boolean
        // EndsWith -> returns -> boolean
        // IndexOf returns -> integer
        // LastIndexOf returns -> integer

        int a=10,b=20;

        System.out.println("The sum of the numbers::"+(a+b));

        boolean status;
        status = str1.contains(str5);
        System.out.println("The text GK is present in ::"+status);
        System.out.println("The text gk is present in ::"+str1.contains("gk"));

        // StartsWith
        System.out.println("The text is starting with GK ::"+str1.startsWith("GK"));
        // Concatenation of Strings::
        System.out.println("Ouytput::"+str1+str2+str3);
        System.out.println("Checking :: GK Gnaneshwar "+str1.startsWith("GK Gnaneshwar"));
        System.out.println("Ending String::"+str1.endsWith("GK Gnaneshwar"));
        System.out.println("Ending string with war::"+str1.endsWith("war"));
        System.out.println("Endig with rya  "+str1.endsWith("rya"));
        System.out.println("Ending with r "+str1.endsWith("r"));
    }
}
