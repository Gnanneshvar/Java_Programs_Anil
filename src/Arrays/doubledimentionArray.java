package Arrays;

import java.util.Scanner;

public class doubledimentionArray {
    public static void main(String[] args) {
        int arr[][]= new int[2][];
        int arr1[][] = {{1,23,4},{4,5,6,7},{7,8,9,0,10}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values for an Array");
        for(int i=0;i<arr.length;i++){
            arr[i] = new int[sc.nextInt()];
            for(int j=0;j<arr[i].length;j++){
                System.out.print("Enter a value::");
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(arr.length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print("arr["+i+"]["+j+"]="+arr[i][j]);
            }
        }
    }
}
