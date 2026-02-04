package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("good");
        set.add("hello");
        set.add("hyy");

        System.out.println(set); // insertion order
    }
}
