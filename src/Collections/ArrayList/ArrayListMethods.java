package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {
    public static void main(String[] args) {
        int arr[] = new int[10];
        // List<Generics> variablename = new ArrayList<Generics>();
        // Generics referes to what Data type (Integer,String,Float,Character>
        //List<Integer> arrList = new ArrayList<Integer>();
        List<Integer> arrList = new ArrayList<>();
        // adding
        // getting
        arrList.add(10);
        arrList.add(20);
        arrList.add(30);
        arrList.add(40);
        arrList.add(50);
        arrList.add(60);
        arrList.add(70);
        arrList.add(80);
        arrList.add(90);
        arrList.add(null);
        arrList.add(null);
        arrList.add(10);
        System.out.println("Value at index 4::"+arrList.get(3));
        //System.out.println("Size of an array::"+arrList.size());
        System.out.println("======Before Delecting======");
        System.out.println(arrList);
        arrList.add(3,37);
        System.out.println("======After Adding=====");
        System.out.println(arrList);
        arrList.remove(3);
        System.out.println(arrList);
        arrList.removeFirst();
        System.out.println(arrList);
        arrList.removeLast();
        System.out.println(arrList);
        System.out.println("Null is present or not::"+arrList.contains(null));
        arrList.set(8,49);
        System.out.println(arrList);
        Iterator<Integer> iterator = arrList.iterator();
        int a,count=0;
        while(iterator.hasNext()){
            try {
                a = iterator.next();
                if(a==10)
                    count++;
            }
            catch(NullPointerException e)
            {
                System.out.println("Null pointer exception has been caught");
            }
            //System.out.println(iterator.next());
        }
        System.out.println("Count of element 10 in the list::"+count);
//        for(int i:arrList)
//            System.out.println(i);
//        for(int i=0;i<arrList.size();i++){
//            System.out.println(arrList.get(i));
//        }
    }
}
