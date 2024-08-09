package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_class {
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

        System.out.println(arrList.isEmpty());
        System.out.println(arrList.indexOf("G"));
        List<String> arrSublist = arrList.subList(2, arrList.size());

//        Iterator<String> iterator = arrSublist.iterator();
//        while (iterator.hasNext()) {
//            if(iterator.next().equals("E"))
//                iterator.remove();
//        }
//        System.out.println(arrSublist);
        ListIterator<String> it = arrSublist.listIterator();
        System.out.println("Sublist from arraylist::"+arrSublist);
        while(it.hasNext()){
            if(it.next().equals("F")) {
//                it.set("H");
//                it.add("K");
                it.remove();
            }
        }
        System.out.println("Updated List::"+arrList);
    }
}
