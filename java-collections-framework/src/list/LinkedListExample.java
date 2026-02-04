package list;


import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> newLinkedList = new LinkedList<>();
        newLinkedList.add("java");
        newLinkedList.add("python");
        newLinkedList.add("go");
        newLinkedList.add("js");
        newLinkedList.add("java");

        for(String n:newLinkedList){
            System.out.println(n);
        }
    }
}
