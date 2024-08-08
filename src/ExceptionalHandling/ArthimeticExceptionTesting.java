package ExceptionalHandling;

public class ArthimeticExceptionTesting {
    public static void main(String[] args) {
        int a=10,b=0,c;
        try {
            c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException E)
        {

        }finally {
            System.out.println("In side Finally block of arthemetic exception");
        }
//        catch(ArithmeticException e){
//            System.out.println("You are dividing a number by zero");
//        }

        int arr[]={1,2,3,4,5,6};
        try {
            int d = a/b;
            System.out.println(arr[6]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Inside Array IndexOutOfBoundsException");
        }
        catch(Exception e){
            System.out.println("Inside Exception Block");
        }
        finally {
            System.out.println("Finally");
        }
        //try, catch, final, throw, throws
    }
}
