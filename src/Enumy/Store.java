package Enumy;

import java.util.HashMap;
import java.util.Map;

public class Store {

    public static void main(String[] args) {

        Map<String, TireType> storeMap = new HashMap<>();

        storeMap.put("Tire", TireType.WINTER);
        storeMap.put("Tire1", TireType.SUMMER);
        storeMap.put("Tire2", TireType.WINTER);
        storeMap.put("Tire3", TireType.SUMMER);
        storeMap.put("Tire4", TireType.ALL);

        //System.out.println(printTireType(storeMap, TireType.SUMMER);

    }

//    private static String printTireType(Map<String, String> map, TireType type) {
//
//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            if (entry.getValue().equals(type)) {
//                return entry.getKey();
//            } else {
//                return "Nie ma opon takiego typu";
//            }
//        }
//    }


}
