package com.bkravets.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordUtils {

    public static String getShortestWord(List<String> words) {
        if(words.isEmpty()) {
            throw new IllegalArgumentException("List cannot be empty");
        }

        String shortestWord = words.get(0);

        for (int i = 1; i < words.size(); i++) {
            String currentWord = words.get(i);

            if(currentWord.length() < shortestWord.length()) {
                shortestWord = currentWord;
            }
        }

        return shortestWord;
    }

    public static Map<String, Integer> countWordsOccurrences(List<String> words) {
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        return map;
    }

}
