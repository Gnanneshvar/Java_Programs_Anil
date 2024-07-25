package Strings;

public class RepeatedCharactersCount {
    public static void main(String[] args) {
        String str = "aabbabbbaabbaaaabbbcbcklaaa";
        int count=0,i=0;
        System.out.println(str.length());
        for(i=0;i<str.length();i++){
            if(str.charAt(i)=='a')
            {
                count++;
            }
        }
        System.out.println("The count of a in the String::"+count);
        count=0;
        char ch[] = str.toCharArray();
        for(i=0;i<ch.length;i++){
            if(ch[i]=='a')
                count++;
        }
        System.out.println("The count of a in the String::"+count);

    }
}
