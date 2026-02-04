package set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("Java");
        set.add("GitHub");

        System.out.println(set);
    }
}
