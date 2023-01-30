package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section5_Arrays;

import java.util.Arrays;

public class Example1_WrongUsageWithArray {
    public static void main(String[] args) {
        Integer[] ints = new Integer[]{1,2,3};
        Number[] nums = ints;
        nums[2] = 3.14;// ArrayStoreException
        assert Arrays.toString(ints).equals("[1, 2, 3.14");
    }
}
