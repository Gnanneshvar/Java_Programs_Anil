package ControlStructure;

public class ReversingOfaNumber {

    int x; // instance variable
    public static void main(String[] args) {
        int num= 463597,output=0,a=10,b=20;
        for(;num>0;)
        {
            output= output*10+num%10; // output = output + num%10;
            num= num/10;
        }
        System.out.println("After Reversing::"+output);
        b=test(a,b);
    }

    static int test(int a,int b) {
        return a+b;
    }
}
