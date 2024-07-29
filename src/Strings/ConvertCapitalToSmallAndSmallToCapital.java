package Strings;

public class ConvertCapitalToSmallAndSmallToCapital {
    public static void main(String[] args) {
        String str = "Hello Welcome to Training";
        String output="";
        char ch1 = 'A'; // 65-90
        char ch2 = 'a'; // 97-122
        int a=ch1,b=ch2;
        char ch3 = (char) (a+32); // 'A'
        char ch4 = (char) (b-32); // 'a'
        System.out.println(ch3);
        System.out.println(ch4);
        System.out.println("Main String::"+str);
        for(int i=0;i<str.length();i++)
        {
            a = str.charAt(i);
            if(a>=65 && a<=90)
            {
                ch1 = (char) (a+32);
                output = output+ch1;
            }
            else if(a>=97 && a<=122)
            {
                ch2 = (char) (a-32);
                output = output+ch2;
            }
            else
            {
                output = output+str.charAt(i);
            }
        }
        System.out.println("After Converstion::"+output);
        output ="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isLowerCase(str.charAt(i)))
            {
                output=output+Character.toUpperCase(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                output = output+Character.toLowerCase(str.charAt(i));
            }
            else {
                output = output+str.charAt(i);
            }
        }
        System.out.println("After Converstion using Character Class::"+output);
        //Character.isAlphabetic(str.charAt(i)) -> true
        //Character.isDigit(str.charAt(i)) -> true when it is numeric
    }
}
