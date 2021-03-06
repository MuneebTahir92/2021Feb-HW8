package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CarBrandMap {

    public static void main(String[] args) {

        Map<String, String> cars = new HashMap<String, String>();

        cars.put("Honda", "Accord");
        cars.put("Toyota", "Camry");
        cars.put("Nissan", "Altima");
        cars.put("Ford", "Explorer");

        for(Map.Entry<String, String> entry:cars.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        // you can change HashMap to LinkedHashMap in order to display all the nodes in order
        // otherwise they will be displayed randomly
    }
}
