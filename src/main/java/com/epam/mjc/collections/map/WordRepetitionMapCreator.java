package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {


    public static void main(String[] args) {

//        String sent = "Fffg sss ff SSS hhhhhh sSs ddd ddd";
        String sent = "Java map can store pairs of keys and values";
        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        wordRepetitionMapCreator.createWordRepetitionMap(sent);
    }


    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new TreeMap<>();
//        wordRepetitionMap.put("sss", 5);
//        String[] arrayOfStringElements = sentence.split(" ");
        String[] arrayOfStringElements = sentence.split(" ");
        System.out.println(Arrays.toString(arrayOfStringElements));

//        for ()

        for (int i = 0; i < arrayOfStringElements.length; i++) {
//            if (!(wordRepetitionMap.containsKey(arrayOfStringElements[i].toLowerCase()))) {
            if (!(wordRepetitionMap.containsKey((arrayOfStringElements[i]).toLowerCase()))) {
                int countForValue = 1;
                wordRepetitionMap.put((arrayOfStringElements[i]).toLowerCase(), countForValue);
                for (int j = i + 1; j < arrayOfStringElements.length; j++) {


                    if (arrayOfStringElements[i].equalsIgnoreCase(arrayOfStringElements[j])) {
                        countForValue++;
                    }
                    wordRepetitionMap.put((arrayOfStringElements[i]).toLowerCase(), countForValue);
//                    countForValue++;
                }
            }

        }
        System.out.println(wordRepetitionMap);

        return wordRepetitionMap;
    }
}

