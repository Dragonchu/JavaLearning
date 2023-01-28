package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section4_GetAndPutPrinciple;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Example3_CountAndSum {
    public static void main(String[] args) {
        List<Number> nums = new ArrayList<>();
        double sum = sumCount(nums, 5);
        assert sum == 10;
    }

    public static double sumCount(Collection<Number> nums, int n) {
        Example2_Count.count(nums, n);
        return Example1_Sum.sum(nums);
    }
}
