package com.thoughtworks.collection;

import java.util.Comparator;
import java.util.List;

public class StreamReduce {

    public int getLastOdd(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 != 0).mapToInt(Integer::intValue).reduce((prev, curr) -> curr).orElse(numbers.get(0));
    }

    public String getLongest(List<String> words) {
        return words.stream().max(Comparator.comparing(String::length)).orElse(words.get(0));
    }

    public int getTotalLength(List<String> words) {
        return words.stream().mapToInt(String::length).reduce(0, Integer::sum);
    }
}
