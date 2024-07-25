package Strings;

public class SubString_Program {
    static String str = "Gujala Kumar Gnaneshwar";
    public static void main(String[] args) {
        String str2 = "Gnaneshwar Kumar Gujala Nihanth Kumar Nihanth";
        //System.out.println("Index of::"+str2.indexOf(" "));
        String str1 = "Kumar";
        String sub = str.substring(3);
        System.out.println("The substring is: " + sub);
        System.out.println(str.indexOf("G"));
        //str.indexOf("G",str.indexOf("G")+1)
        System.out.println("Sub String using index::"+str.substring(str.indexOf("G",str.indexOf("G")+1)));

        //
        System.out.println("Length of ::"+str1.length());

        if(str.contains(str1))
        {
            System.out.println("Extracting substring::"+str.substring(str.indexOf(" ")+1,str1.length()+str.indexOf(" ")));
        }
        countCharacters();
    }

    public static void countCharacters() {
        int count = 0;
        for(int i=0;i<str.length();i++)
        {
            if(str.substring(i,i+1).equals("a"))
                count++;
        }
        System.out.println("No of A in the string::"+count);
    }
}
