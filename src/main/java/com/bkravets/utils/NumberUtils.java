package com.bkravets.utils;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static int getSum(List<Integer> integers) {
        if(integers == null || integers.isEmpty()) {
            throw new IllegalArgumentException("List should have numbers");
        }

        int sum = 0;

        for (Integer integer : integers) {
            sum += integer;
        }

        return sum;
    }


    public static List<Integer> multiplyOddNumbers(List<Integer> integers) {
        List<Integer> results = new ArrayList<>();

        for (Integer integer : integers) {
            if((integer % 2) != 0) {
                results.add(integer * 2);
            }
        }

        return results;
    }
}
