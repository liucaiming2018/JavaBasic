package org.example.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapValueSort {

    public static void main(String[] args) {

        Map<String ,Long> tyeps=new HashMap<>();

        tyeps.put("A",21212L);
        tyeps.put("B",Long.MAX_VALUE);
        tyeps.put("C",2112L);

        Map<String ,Long> dsd=sortMapByValues(tyeps);
        System.out.printf("Map");

    }

    public static <K extends Comparable, V extends Comparable> Map<K, V> sortMapByValues(Map<K, V> aMap) {
        HashMap<K, V> finalOut = new LinkedHashMap<>();
        aMap.entrySet()
                .stream()
                .sorted((p1, p2) -> p2.getValue().compareTo(p1.getValue()))
                .collect(Collectors.toList()).forEach(ele -> finalOut.put(ele.getKey(), ele.getValue()));
        return finalOut;

    }
}
