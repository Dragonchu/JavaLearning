package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section5_Arrays;

import java.util.Arrays;
import java.util.List;

public class Example2_WrongUsageWithList {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        //List<Number> nums = ints; compile-time error
    }
}
