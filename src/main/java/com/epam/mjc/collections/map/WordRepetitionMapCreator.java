package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {

    // define strings as static final
    private static final String SENTENCE = "hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe.";
    private static final String REGEX = "\\,\\s|\\s|\\.";



    public static void main(String[] args) {

        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        wordRepetitionMapCreator.createWordRepetitionMap(SENTENCE);

//        String sentence = "hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe.";
//        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
//        wordRepetitionMapCreator.createWordRepetitionMap(sentence);
    }


    public Map<String, Integer> createWordRepetitionMap(String sentence) {

        Map<String, Integer> wordRepetitionMaps = new HashMap<>();

        if (!sentence.isEmpty()) {
            String[] splittedStrings = sentence.split(REGEX);

            for (String s : splittedStrings) {
                // DRY principle (don't repeat yourself). Apply a variable for repeating actions
                String lowerCaseString =  s.toLowerCase();

                // in if condition first define the positive path
                // !(wordRepetitionMap.containsKey((arrayOfStringElements[i]).toLowerCase()))
                if (wordRepetitionMaps.containsKey(lowerCaseString)) {
                    wordRepetitionMaps.put(lowerCaseString, wordRepetitionMaps.get(lowerCaseString) + 1);
                } else {
                    wordRepetitionMaps.put(lowerCaseString, 1);
                }
            }
        }
        System.out.println(wordRepetitionMaps);
        return wordRepetitionMaps;
    }

//        Map<String, Integer> wordRepetitionMap = new HashMap<>();
//        String[] arrayOfStringElements = sentence.split("\\,\\s|\\s|\\.");
//        System.out.println(Arrays.toString(arrayOfStringElements));
//
//        if (!("".equals(sentence))) {
//            for (int i = 0; i < arrayOfStringElements.length; i++) {
//                if (!(wordRepetitionMap.containsKey((arrayOfStringElements[i]).toLowerCase()))) {
//                    wordRepetitionMap.put(arrayOfStringElements[i].toLowerCase(), 1);
//                } else {
//                    wordRepetitionMap.put(arrayOfStringElements[i].toLowerCase(), wordRepetitionMap.get(arrayOfStringElements[i].toLowerCase()) + 1);
//                }
//            }
//            System.out.println(wordRepetitionMap);
//
//            return wordRepetitionMap;
//
//        } else
//            System.out.println(wordRepetitionMap);
//        return wordRepetitionMap;
//    }

//    public Map<String, Integer> createWordRepetitionMap02(String sentence) {
//
//        Map<String, Integer> wordRepetitionMap = new HashMap<>();
//        List<String> myList = new ArrayList<>(Arrays.asList(sentence.split("\\,\\s|\\s|\\.")));
//        System.out.println(myList);
//        if (!("".equals(sentence))) {
//            for (int i = 0; i < myList.size(); i++) {
//                if (!(wordRepetitionMap.containsKey((myList.get(i)).toLowerCase()))) {
//                    wordRepetitionMap.put((myList.get(i)).toLowerCase(), 1);
//                } else {
//                    wordRepetitionMap.put((myList.get(i)).toLowerCase(), wordRepetitionMap.get(myList.get(i).toLowerCase()) + 1);
//                }
//            }
//            System.out.println(wordRepetitionMap);
//
//            return wordRepetitionMap;
//        } else {
//            System.out.println(wordRepetitionMap);
//            return wordRepetitionMap;
//        }
//    }
//
//    public Map<String, Integer> createWordRepetitionMapAsl(String sentence) {
//        Map<String, Integer> wordRepetitionMap = new HashMap<>();
//        StringTokenizer s = new StringTokenizer(sentence, " .,");
////        System.out.println(Arrays.toString());
//        while (s.hasMoreTokens()) {
//            String letter = s.nextToken().toLowerCase();
//            wordRepetitionMap.put(letter, wordRepetitionMap.getOrDefault(letter, 0) + 1);
//        }
//        System.out.println(wordRepetitionMap);
//
//        return wordRepetitionMap;
//    }

}

