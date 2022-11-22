package com.bkravets.utils;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NumberUtilsTest {

    @Test
    void shouldGetSum() {
        List<Integer> list = List.of(5 ,3 ,4);

        int sum = NumberUtils.getSum(list);

        assertThat(sum)
                .isEqualTo(12);
    }


    @Test
    void shouldNtGetSumThrowsExceptionWhenListNull() {
        List<Integer> list = null;

        assertThatThrownBy(() -> NumberUtils.getSum(list))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("List should have numbers");
    }

    @Test
    void shouldNtGetSumThrowsExceptionWhenListEmpty() {
        List<Integer> list = new ArrayList<>();

        assertThatThrownBy(() -> NumberUtils.getSum(list))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("List should have numbers");
    }

    @Test
    void shouldMultiplyOddNumbers() {

        List<Integer> list = List.of(2 ,3 ,5, 8);

        List<Integer> actualList = NumberUtils.multiplyOddNumbers(list);

        List<Integer> expectedList = List.of(6, 10);

        assertThat(actualList)
                .isEqualTo(expectedList);
    }
}