package Strings;

public class ReverseAString {
    public static void main(String[] args) {
        String str ="Selenium";
        String output = "";
        for(int i=str.length()-1;i>=0;i--){
            output = output + str.charAt(i);
        }
        System.out.println("Output::"+output);

        output = "";
        for(int i=str.length()-1;i>=0;i--){
            output = output + str.substring(i,i+1);
        }
        System.out.println(output);
        output = "";
        for(int i=str.length()-1;i>=0;i--){
            output = output.concat(str.substring(i,i+1));
        }
        System.out.println(output);
        System.out.println(output.concat(str.substring(0,1)));
    }
}
