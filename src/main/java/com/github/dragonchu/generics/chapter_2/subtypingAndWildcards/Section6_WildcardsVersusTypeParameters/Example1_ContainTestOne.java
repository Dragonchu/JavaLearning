package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section6_WildcardsVersusTypeParameters;

import java.util.Arrays;
import java.util.List;

public class Example1_ContainTestOne {
    public static void main(String[] args) {
        Object obj = "one";
        List<Object> objs = Arrays.asList("one",2,3.14,4);
        List<Integer> ints = Arrays.asList(2,4);
        assert objs.contains(obj);
        assert objs.containsAll(ints);
        assert !ints.contains(obj);
        assert !ints.containsAll(objs);
    }
}
