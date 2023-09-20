package Temp;

import java.util.LinkedList;

public class LLTasks {
    public static void main(String[] args) {


        LinkedList<Object> ll = new LinkedList<>();
        LinkedList<Object> nwll = new LinkedList<>();

        ll.add("Geeks");
        ll.add("For");
        ll.add("Geek");
        ll.add("2020");
        ll.add("2021");

        System.out.println(ll);
        for (Object item : ll) {
            nwll.addFirst(item);
        }
        System.out.println(nwll);
    }

}