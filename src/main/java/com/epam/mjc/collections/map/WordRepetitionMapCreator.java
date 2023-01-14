package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {


    public static void main(String[] args) {

//        String sent = "Fffg sss ff SSS hhhhhh sSs ddd ddd";
        String sentence = "Java java";
//        String sentence = "Java map can store pairs of keys and values";
        String sentence2 = "sentence in loWER caSE SENTENCE IN UPper CAse";
        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        wordRepetitionMapCreator.createWordRepetitionMap(sentence2);
//        System.out.println("aaraylist");
//        wordRepetitionMapCreator.createWordRepetitionMap02(sentence2);
    }


    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new TreeMap<>();
//        wordRepetitionMap.put("sss", 5);
//        String[] arrayOfStringElements = sentence.split(" ");
        String[] arrayOfStringElements = sentence.split(" ");
        List<String> myList = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        System.out.println(Arrays.toString(arrayOfStringElements));
        System.out.println(myList);

//        for ()

        for (int i = 0; i < arrayOfStringElements.length; i++) {
//            if (!(wordRepetitionMap.containsKey(arrayOfStringElements[i].toLowerCase()))) {
            if (!(wordRepetitionMap.containsKey((arrayOfStringElements[i]).toLowerCase()))) {
                int countForValue = 1;
                String tempElement = arrayOfStringElements[i].toLowerCase();
//                wordRepetitionMap.put((arrayOfStringElements[i]).toLowerCase(), countForValue);
                wordRepetitionMap.put(tempElement, countForValue);
                for (int j = i + 1; j < arrayOfStringElements.length; j++) {


                    if (arrayOfStringElements[i].equalsIgnoreCase(arrayOfStringElements[j])) {
                        countForValue++;
                    }
                    wordRepetitionMap.put(tempElement, countForValue);
//                    countForValue++;
                }
            }

        }
        System.out.println(wordRepetitionMap);

        return wordRepetitionMap;
    }

    public Map<String, Integer> createWordRepetitionMap02(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
//        wordRepetitionMap.put("sss", 5);
//        String[] arrayOfStringElements = sentence.split(" ");
        List<String> myList = new ArrayList<String>(Arrays.asList(sentence.split(" ")));
        System.out.println(myList);

//        for ()

        for (int i = 0; i < myList.size(); i++) {
//            if (!(wordRepetitionMap.containsKey(arrayOfStringElements[i].toLowerCase()))) {
            if (!(wordRepetitionMap.containsKey((myList.get(i)).toLowerCase()))) {
                int countForValue = 1;
                wordRepetitionMap.put((myList.get(i)).toLowerCase(), countForValue);
                for (int j = i + 1; j < myList.size(); j++) {


                    if (myList.get(i).equalsIgnoreCase(myList.get(j))) {
                        countForValue++;
                    }
                    wordRepetitionMap.put((myList.get(i)).toLowerCase(), countForValue);
//                    countForValue++;
                }
            }

        }
        System.out.println(wordRepetitionMap);

        return wordRepetitionMap;
    }

}

