package ControlStructure;

public class FactorialOfANumber {
    public static void main(String[] args) {
        int num = 6,fact=1,i;
        for(i=1;i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
