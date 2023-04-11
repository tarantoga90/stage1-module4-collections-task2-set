package com.epam.mjc.collections.set;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        TreeSet<Integer> set = new TreeSet<>();

        sourceList.stream()
                .map(x -> x *= x)
                .filter(x -> x >= lowerBound && x <= upperBound)
                .forEach(set::add);

        return set;
    }
}
