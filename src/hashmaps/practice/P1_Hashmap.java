package hashmaps.practice;

import java.util.HashMap;

public class P1_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1,"jafar");
        myMap.put(2,"jakeer");
        myMap.put(4,"raj kiran");
        System.out.println(myMap.get(4));
        System.out.println(myMap.containsKey(3));
        System.out.println(myMap.getOrDefault(2,"Not found"));
        System.out.println(myMap.size());
        System.out.println(myMap.remove(2));
        System.out.println(myMap.isEmpty());

    }
}
