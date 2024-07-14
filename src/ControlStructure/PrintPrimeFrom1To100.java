package ControlStructure;

public class PrintPrimeFrom1To100 {
    double var;
    void primeNumber1To100() {
        int i,num,factor;
//        System.out.println(variable);
        for(int j=2;j<=100;j++)
        {
            factor=0;
            num=j;
            for(i=2;i<num/2+1;i++)
            {
                if(num%i==0)
                {
                    factor+=1;
                    break;
                }
            }
            if(factor==0)
                System.out.println(j+" is a Prime Number");
        }
    }
}