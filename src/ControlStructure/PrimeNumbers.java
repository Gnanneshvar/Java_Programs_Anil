package ControlStructure;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num=37,factor=0,i;
        for (i=2;i<=num/2;i++) {
            if(num%i==0)
                factor+= 1;
        }
        System.out.println("Number of iterations::"+i);
        if(factor==0)
            System.out.println("Number is prime ");
        else
            System.out.println("Number is not a prime");
        num  = 27;
        factor = 0;
        for(i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                factor+=1;
                break;
            }
        }
        System.out.println("Number of iterations::"+i);
        if(factor==0)
            System.out.println("Number is prime ");
        else
            System.out.println("Number is not a prime");

    }
}
