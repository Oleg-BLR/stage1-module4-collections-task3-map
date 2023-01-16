package com.epam.mjc.collections.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KeyValueSwapper {
    public static void main(String[] args) {
        Map<Integer, String> initialMap = new HashMap<>();
        initialMap.put(1, "one");
        initialMap.put(2, "two");
        initialMap.put(3, "three");
        initialMap.put(10, "one");
        KeyValueSwapper keyValueSwapper = new KeyValueSwapper();
        keyValueSwapper.swap(initialMap);

    }
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        List<Integer> keyIntegerList = new ArrayList<>();
        List<String> valueStringList = new ArrayList<>();
        Map<String, Integer> swapedMap = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            keyIntegerList.add(entry.getKey());
            valueStringList.add(entry.getValue());
        }
        for (int i = 0; i < valueStringList.size(); i++) {
            String tempValue = valueStringList.get(i);
            if (!(swapedMap.containsKey(tempValue))) {
                int minKey = keyIntegerList.get(i);
                for (int j = i + 1; j < valueStringList.size(); j++) {
                    if (tempValue.equals(valueStringList.get(j))) {
                        if (minKey > keyIntegerList.get(j)) {
                            minKey = keyIntegerList.get(j);
                        }
                    }
                }
                swapedMap.put(tempValue, minKey);
            }
//        valueStringList.forEach(String );

//        for (Integer key : sourceMap.keySet()) {
//            sourceMap.get(key)
//        }
//            return swapedMap;
        }
        System.out.println(sourceMap);
        System.out.println(keyIntegerList);
        System.out.println(swapedMap);
        return swapedMap;
    }
}
