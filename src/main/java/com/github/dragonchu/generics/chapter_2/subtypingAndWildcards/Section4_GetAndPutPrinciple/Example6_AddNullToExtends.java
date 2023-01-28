package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section4_GetAndPutPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Example6_AddNullToExtends {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        nums.add(null);
        assert nums.toString().equals("[1, 2, null]");
    }
}
