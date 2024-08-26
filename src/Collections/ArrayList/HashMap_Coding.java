package Collections.ArrayList;

import java.util.*;

public class HashMap_Coding {
    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        Map<String,String> linkedHashMap = new LinkedHashMap<>();
        hashMap.put("A","B");
        hashMap.put("C","D");
        hashMap.put("E","F");
        hashMap.put("G","H");
        hashMap.put("B","B");
        hashMap.put(null,null);
        System.out.println(hashMap);
        hashMap.put("A","A");
        System.out.println(hashMap);
        linkedHashMap.put("G","K");
        linkedHashMap.put("V","I");
        linkedHashMap.put("X","Y");
        linkedHashMap.put("Z","Z");
        linkedHashMap.put(null,null);
        System.out.println("Linked Hashmap::"+linkedHashMap);
        System.out.println("GetMethod::"+linkedHashMap.get("Z"));
        Set<String> set = linkedHashMap.keySet();
        System.out.println(set);
        Collection<String> list = linkedHashMap.values();
        System.out.println("Key Set::"+linkedHashMap.keySet());
        System.out.println("Values::"+linkedHashMap.values());
        System.out.println("Empty ::"+linkedHashMap.isEmpty());
        System.out.println("Contains Key::"+linkedHashMap.containsKey(null));
        System.out.println("Contains Value::"+linkedHashMap.containsValue("K"));
    }
}
