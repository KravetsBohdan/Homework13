package com.bkravets.utils;


import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class WordUtilsTest {

    @Test
    void shouldGetShortestWord() {
        List<String> list = List.of("one", "three", "four");

        String shortestWord = WordUtils.getShortestWord(list);

        assertThat(shortestWord)
                .isEqualTo("one");
    }

    @Test
    void shouldNotGetShortestWordThrowsExceptionWhenListEmpty() {
        List<String> list = new ArrayList<>();

        assertThatThrownBy(() -> WordUtils.getShortestWord(list))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("List cannot be empty");
    }

    @Test
    void shouldCountWordsOccurrences() {

        List<String> list = List.of("one", "one","two", "two", "three");

        Map<String, Integer> wordsOccurrences = WordUtils.countWordsOccurrences(list);

        Map<String, Integer> expectedMap = Map.of("one",2, "two", 2, "three", 1);

        assertThat(wordsOccurrences)
                .isEqualTo(expectedMap);
    }

}