package Strings;

public class StringReplace {
    static String str = "Gujala Kumar Gnaneshwar";
    public static void main(String[] args) {
        str.replace(' ','a');
        System.out.println(str);
        System.out.println(str.replace(' ','a'));
        System.out.println(str.replace(" ",""));
    }
}
