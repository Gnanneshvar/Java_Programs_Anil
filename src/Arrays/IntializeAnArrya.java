package Arrays;

import java.util.Scanner;

public class IntializeAnArrya {
    public static void main(String[] args) {
        int arr[]; // this is traditional
//        int []arr1;
//        int[] arr2;// this is traitional
        Scanner obj = new Scanner(System.in);
        int a=5;
        arr = new int[a];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the value::");
            arr[i] = obj.nextInt();
        }
        System.out.println("Printing the value::");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
}
