package map;

import java.util.*;

public class BrandAndModelList {

    public static void main(String[] args) {

        List<String> hondaModels = new ArrayList<String>();
        hondaModels.add("Accord");
        hondaModels.add("Civic");
        hondaModels.add("Odyssey");
        hondaModels.add("Pilot");

        List<String> toyotaModels = new ArrayList<String>();
        toyotaModels.add("Camry");
        toyotaModels.add("Corolla");
        toyotaModels.add("Prius");
        toyotaModels.add("Avalon");

        List<String> nissanModels = new ArrayList<String>();
        nissanModels.add("Altima");
        nissanModels.add("Maxima");
        nissanModels.add("Pathfinder");
        nissanModels.add("Rogue");

        List<String> fordModels = new ArrayList<String>();
        fordModels.add("Explorer");
        fordModels.add("Expedition");
        fordModels.add("Taurus");
        fordModels.add("Edge");

        Map<String, List<String>> cars = new HashMap<String, List<String>>();
        cars.put("Honda Cars:", hondaModels);
        cars.put("Toyota Cars:", toyotaModels);
        cars.put("Nissan Cars:", nissanModels);
        cars.put("Ford Cars:", fordModels);

        for(Map.Entry<String, List<String>> entry:cars.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
