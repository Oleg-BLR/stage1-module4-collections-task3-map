package com.epam.mjc.collections.map;

import java.util.*;

public class WordRepetitionMapCreator {


    public static void main(String[] args) {

//        String sentence = "";
//        String sentence = "Java Map can store pairs of keys and values.";
        String sentence = "hello word in lOwEr cAsE, HELLO WORD in UpPeR CaSe.";
        WordRepetitionMapCreator wordRepetitionMapCreator = new WordRepetitionMapCreator();
        wordRepetitionMapCreator.createWordRepetitionMap(sentence);
        wordRepetitionMapCreator.createWordRepetitionMap02(sentence);
        wordRepetitionMapCreator.createWordRepetitionMapAsl(sentence);
    }


    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        String[] arrayOfStringElements = sentence.split("\\,\\s|\\s|\\.");
        System.out.println(Arrays.toString(arrayOfStringElements));

        if (!("".equals(sentence))) {
            for (int i = 0; i < arrayOfStringElements.length; i++) {
                if (!(wordRepetitionMap.containsKey((arrayOfStringElements[i]).toLowerCase()))) {
                    wordRepetitionMap.put(arrayOfStringElements[i].toLowerCase(), 1);
                } else {
                    wordRepetitionMap.put(arrayOfStringElements[i].toLowerCase(), wordRepetitionMap.get(arrayOfStringElements[i].toLowerCase()) + 1);
                }
            }
            System.out.println(wordRepetitionMap);

            return wordRepetitionMap;

        } else
            System.out.println(wordRepetitionMap);
        return wordRepetitionMap;
    }

    public Map<String, Integer> createWordRepetitionMap02(String sentence) {

        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        List<String> myList = new ArrayList<>(Arrays.asList(sentence.split("\\,\\s|\\s|\\.")));
        System.out.println(myList);
        if (!("".equals(sentence))) {
            for (int i = 0; i < myList.size(); i++) {
                if (!(wordRepetitionMap.containsKey((myList.get(i)).toLowerCase()))) {
                    wordRepetitionMap.put((myList.get(i)).toLowerCase(), 1);
                } else {
                    wordRepetitionMap.put((myList.get(i)).toLowerCase(), wordRepetitionMap.get(myList.get(i).toLowerCase()) + 1);
                }
            }
            System.out.println(wordRepetitionMap);

            return wordRepetitionMap;
        } else {
            System.out.println(wordRepetitionMap);
            return wordRepetitionMap;
        }
    }

    public Map<String, Integer> createWordRepetitionMapAsl(String sentence) {
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        StringTokenizer s = new StringTokenizer(sentence, " .,");
//        System.out.println(Arrays.toString());
        while (s.hasMoreTokens()) {
            String letter = s.nextToken().toLowerCase();
            wordRepetitionMap.put(letter, wordRepetitionMap.getOrDefault(letter, 0) + 1);
        }
        System.out.println(wordRepetitionMap);

        return wordRepetitionMap;
    }

}

