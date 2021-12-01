package com.thoughtworks.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamSupplement {

    public StreamSupplement() {
    }

    public List<Integer> sortFromMaxToMin(List<Integer> numbers) {
        return numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }

    public double getAverage(List<Integer> numbers) {
        return numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().max(Comparator.naturalOrder()).orElse(0);
    }

}
