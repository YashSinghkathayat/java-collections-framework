package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> newArrayList = new ArrayList<>();
        newArrayList.add("Yash");
        newArrayList.add("Parag");
        newArrayList.add("kapil");
        newArrayList.add("Ankit");
        newArrayList.add("Yash");

        for(String n:newArrayList){
            System.out.println(n);
        }
    }
}
