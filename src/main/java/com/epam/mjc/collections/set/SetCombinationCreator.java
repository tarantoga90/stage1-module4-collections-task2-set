package com.epam.mjc.collections.set;

import java.util.Set;
import java.util.stream.Collectors;

public class SetCombinationCreator {
    public Set<String> createSetCombination(Set<String> firstSet, Set<String> secondSet, Set<String> thirdSet) {

        Set<String> set = firstSet.stream()
                .filter(secondSet::contains)
                .filter(x -> !thirdSet.contains(x))
                .collect(Collectors.toSet());

        Set <String> set1 = thirdSet.stream()
                .filter(x -> !firstSet.contains(x) & !secondSet.contains(x))
                .collect(Collectors.toSet());

        set.addAll(set1);

        return set;
    }
}
