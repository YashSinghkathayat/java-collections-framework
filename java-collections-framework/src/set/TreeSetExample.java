package set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(5);
        set.add(2022112);
        set.add(1);

        System.out.println(set); // sorted order
    }
}
