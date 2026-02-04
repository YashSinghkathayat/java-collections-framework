package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedhashMap {
    public static void main(String[] args) {
        Map<Integer, String> linkedhasmap = new LinkedHashMap<>();
        linkedhasmap.put(4, "hello");
        linkedhasmap.put(1, "hoooo");
        linkedhasmap.put(2, "hell");
        linkedhasmap.put(3, "hii");
        //it maintains the insertion order

        System.out.println(linkedhasmap);
    }
}
