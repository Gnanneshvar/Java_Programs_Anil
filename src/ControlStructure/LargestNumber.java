package ControlStructure;

public class LargestNumber {
    public static void main(String[] args) {
        int num1=39,num2=37,num3=41; // num1>num2 and num1>num3 And OR
        if(num1>num2){
            System.out.println("Number1 is greater");
        }
        else
            System.out.println("Number2 is greater");

        if(num1>num2 && num1>num3){
            System.out.println("Number1 is greater");
        } else if (num2 > num3 && num2>num1) {
            System.out.println("Number 2 is greater");
        }
        else {
            System.out.println("Number 3 is greater");
        }

    }
}
