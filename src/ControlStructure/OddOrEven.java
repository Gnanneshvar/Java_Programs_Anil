package ControlStructure;

import ClassesAndObjects.InstanceVariables;

public class OddOrEven {
    public static void main(String[] args) {

        int age = 47;
        if(age%2!=0)
        {
            System.out.print("Odd number");
        }
        else
        {
            System.out.print("Even Number");
        }

        if(age>=18)
            System.out.println("Eligible for voting");
        else
            System.out.println("Not eligible for voting");
        InstanceVariables.print1();
    }
}
