package org.example;

import java.util.List;

public class Calculator {
    public Integer add(Integer a, Integer b) {
        return a+b;
    }

    public Integer sum(List<Integer> numbers) {
        Integer total = 0;
        for (Integer i: numbers)
            total += i;
        return total;
    }
}
