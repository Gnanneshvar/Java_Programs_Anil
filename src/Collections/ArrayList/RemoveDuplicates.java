package Collections.ArrayList;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = {10,20,50,40,30,20,67,60,30,20,11,20,30,89,57,54,30,37};
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        for(int i:arr)
        {
            if(!list.contains(i))
                list.add(i);
        }
        System.out.println("After remvoing duplicates the list is::"+list);

        for(int i:arr)
        {
            set.add(i);
        }
        System.out.println("After remvoing duplicates the set is::"+set);
        for(int i:arr)
        {
            treeSet.add(i);
        }
        treeSet.add(null);
        System.out.println("After Remvoing duplicates and sorted ::"+treeSet);
    }
}
