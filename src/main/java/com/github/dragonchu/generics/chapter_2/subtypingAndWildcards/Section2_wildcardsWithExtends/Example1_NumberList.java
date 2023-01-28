package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section2_wildcardsWithExtends;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1_NumberList {
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        List<Double> doubles = Arrays.asList(1.0,2.3,4.5);
        List<Integer> ints = Arrays.asList(1,2,3,4);
        //Collection<? extends E> c
        nums.addAll(doubles);
        nums.addAll(ints);
        assert nums.toString().equals("[1.0, 2.3, 4.5, 1, 2, 3, 4]");
    }
}
