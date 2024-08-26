package Collections.ArrayList;

import java.util.*;

public class CountNumberOfCharactersAndItsSize {
    public static void main(String[] args) {
        String str = "GKGnaneshwar Welcome To The Selenium Training";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){
            if(i==0)
            {
                map.put(str.charAt(i),1);
            }
            else {
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i),map.get(str.charAt(i))+1);
                }
                else
                {
                    map.put(str.charAt(i),1);
                }
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
        Set<Character> set = map.keySet();
        Set<Character> set1= new LinkedHashSet<>();
        set1.addAll(set);
        System.out.println("Linked hash Set::");
        for(Character c:set){
            System.out.println(c + " ::"+map.get(c));
        }
       // System.out.println(map);
    }
}
