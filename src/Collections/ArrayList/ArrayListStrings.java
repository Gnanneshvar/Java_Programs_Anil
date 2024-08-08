package Collections.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStrings {
    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        List<String> subList = new ArrayList<>();
        arrList.add("A");
        arrList.add("B");
        arrList.add("C");
        arrList.add("D");
        arrList.add("E");
        arrList.add("F");
        arrList.add("G");
        subList.add("H");
        subList.add("C");
        subList.add("I");
        subList.add("J");
        subList.add("K");
        subList.add("A");
        subList.add("L");
        subList.add("M");
        subList.add("B");

        System.out.println("ArrListL::"+arrList);
        System.out.println("SubListL::"+subList);
        //arrList.addAll(subList);
        arrList.removeAll(subList);
        System.out.println("Arrlist after remvoing::"+arrList);
        System.out.println(arrList);
        subList.addAll(2, arrList);
        System.out.println(subList);
        System.out.println("Arrlist::"+arrList);
        subList.removeAll(arrList);
        System.out.println("Sublist After Remvoing::"+subList);
    }
}
