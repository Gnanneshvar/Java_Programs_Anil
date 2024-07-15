package ControlStructure;

public class PyramindPrinting {
    public int i;
    int k;
    private int j;
    public static int l;
    private static int m;
    static int n;
    public PyramindPrinting()
    {
        System.out.println("Inside a Constructor");
    }
    public void reversePyramid() {
        for (i = 0; i < 5; i++) {
            for (j = 0; j <= i; j++)
                System.out.print(" ");
            for (k = i; k < 5; k++)
                System.out.print("* ");
            System.out.println();
        }
    }
    void printPyramid() {
        for( i=0;i<5;i++)
        {
            for( j=i;j<5;j++)
                System.out.print(" ");
            for( k=0;k<=i;k++)
                System.out.print(" *");
            System.out.println();
        }
    }
    private void printPattern()
    {
        for( i=0;i<5;i++)
        {
            for(j=i;j<5;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
