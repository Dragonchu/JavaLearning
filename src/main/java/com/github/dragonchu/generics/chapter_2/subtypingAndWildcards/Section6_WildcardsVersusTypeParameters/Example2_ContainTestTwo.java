package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section6_WildcardsVersusTypeParameters;

import java.util.Arrays;
import java.util.List;

public class Example2_ContainTestTwo {
    public static void main(String[] args) {
        Object obj = 1;
        List<Object> objs = Arrays.asList(1,3);
        List<Integer> ints = Arrays.asList(1,2,3,4);
        assert ints.contains(obj);
        assert ints.containsAll(objs);
    }
}
