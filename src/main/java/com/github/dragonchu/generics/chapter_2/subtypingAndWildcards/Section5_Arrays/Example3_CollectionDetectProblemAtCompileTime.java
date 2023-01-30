package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section5_Arrays;

import java.util.Arrays;
import java.util.List;

public class Example3_CollectionDetectProblemAtCompileTime {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        List<? extends Number> nums = ints;
        //nums.set(2,3.14); compile-time error
    }
}
