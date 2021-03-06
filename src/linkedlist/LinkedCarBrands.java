package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedCarBrands {

    public static void main(String[] args) {

        List<String> brands = new LinkedList<String>();

        brands.add("Honda");
        brands.add("Toyota");
        brands.add("Nissan");
        brands.add("Ford");

        Iterator it = brands.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
