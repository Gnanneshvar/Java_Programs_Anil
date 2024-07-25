package Strings;

public class IndexofLastIndex {
    public static void main(String[] args) {
        String str1 = "GK Gnaneshwar";
        String str2 = "Sahiti Chagarlamudi";
        String str3 = "Surya";
        System.out.println(str1.indexOf("a"));
        System.out.println("Last index of::"+str2.lastIndexOf("a"));
        System.out.println("First index of::"+str2.indexOf('a'));
        System.out.println("The second index of character a::"+str2.indexOf('a',str2.indexOf('a')+1));
        System.out.println("The 3rd index of Character a::"+str2.indexOf('a',str2.indexOf('a',str2.indexOf('a')+1)+1));
    }
}
