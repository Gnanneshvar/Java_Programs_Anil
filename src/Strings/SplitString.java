package Strings;

public class SplitString {
    public static void main(String[] args) {
        String str = "G K Gnaneshwar";
        String str2 = "Gujala Kumar Gnaneshwar";
        //split return the array of strings
        String arr[] = str.split(" ");
        String str1 = str.split(" ")[2];
        System.out.println("Index 2::"+str1);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        String arr1[] = str2.split("a");
        System.out.println(arr1.length-1);
        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
