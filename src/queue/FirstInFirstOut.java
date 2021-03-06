package queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstInFirstOut {

    public static void main(String[] args) {

        Queue<String> first = new LinkedList<String>();

        first.add("Henry");
        first.add("Jennifer");
        first.add("Hannah");
        first.add("Michael");

        System.out.println("Who is first?");
        System.out.println(first.element());
        System.out.println("Henry is leaving");
        first.remove();
        System.out.println("Who is next?");
        System.out.println(first.element());
        System.out.println("Jennifer and Hannah have left");
        first.remove();
        first.remove();
        System.out.println("Who is left?");
        System.out.println(first.element());
    }
}
