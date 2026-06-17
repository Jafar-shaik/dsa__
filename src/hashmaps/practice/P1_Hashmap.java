package hashmaps.practice;

import java.util.HashMap;

public class P1_Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> myMap = new HashMap<>();
        myMap.put(1, 200);
        myMap.put(2, 190);
        myMap.put(3, 199);
        System.out.println(myMap.get(3));
        System.out.println(myMap.getOrDefault(2, 0));
        System.out.println(myMap.get(4));
        System.out.println(myMap.getOrDefault(4, 0));
        myMap.replace(1, 500);
        System.out.println(myMap.get(1));



    }
}
