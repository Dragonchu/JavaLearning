package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section4_GetAndPutPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Example4_WrongUsageWithExtend {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints;
        double dbl = Example1_Sum.sum(nums);
        //nums.add(3.14); compile-time error
    }
}
