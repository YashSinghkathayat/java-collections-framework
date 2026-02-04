package map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> haspMap = new HashMap<>();

        haspMap.put(555,"Yash");
        haspMap.put(300000,"Vinod");
        haspMap.put(1,"Vikas");
        haspMap.put(2000000,"jatin");

        System.out.println(haspMap);

        System.out.println("Key 2 Value : " + haspMap.get(2));

        for (Map.Entry<Integer, String> entry : haspMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}}
