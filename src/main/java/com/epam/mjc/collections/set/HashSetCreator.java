package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {
    public HashSet<Integer> createHashSet(List<Integer> sourceList) {
        HashSet<Integer> result = new HashSet<>();

        if (sourceList.isEmpty()) {
            return result;
        }

        for (Integer i : sourceList) {

            if (i % 2 == 0) {
                Integer intermediate = i;

                while (intermediate % 2 == 0) {
                    result.add(intermediate);
                    intermediate = intermediate / 2;
                }

                result.add(intermediate);

            } else {
                result.add(i);
                result.add(i * 2);
            }
        }

        return result;
    }
}
