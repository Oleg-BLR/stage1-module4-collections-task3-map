package com.epam.mjc.collections.map;

import java.util.*;

public class FunctionValueFinder {


    public static void main(String[] args) {
//    List<String> initialStringData = new ArrayList<>((Arrays.asList("7", "10", "6", "-7", "-2", "0", "-2", "-23")));
        List<Integer> dataOfIntegers = new ArrayList<>(Arrays.asList(-1, 5, 4, 8));
        FunctionValueFinder functionValueFinder = new FunctionValueFinder();
//        functionValueFinder.isFunctionValuePresent02(dataOfIntegers, 1);
//        System.out.println(functionValueFinder.isFunctionValuePresent02(dataOfIntegers, 1));
        functionValueFinder.isFunctionValuePresent(dataOfIntegers, 28);
        System.out.println(functionValueFinder.isFunctionValuePresent(dataOfIntegers, 28));

    }

    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        int countRequiredValue = 0;
        for (Integer v : functionMap.values()) {
            if (v == requiredValue){
                countRequiredValue++;
            }
        }
        if (countRequiredValue > 0) return true;
        return false;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map<Integer, Integer> calculatedMap = new HashMap<>();
        sourceList.forEach(e -> calculatedMap.put(e, e * 5 + 2));
        return calculatedMap;
    }
}
