package map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(5,"Y");
        treeMap.put(3,"d");
        treeMap.put(41,"s");
        treeMap.put(1,"j");

        System.out.println(treeMap);
}}
