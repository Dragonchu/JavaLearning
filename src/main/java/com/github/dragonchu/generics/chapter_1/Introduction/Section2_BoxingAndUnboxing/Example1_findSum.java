package com.github.dragonchu.generics.chapter_1.Introduction.Section2_BoxingAndUnboxing;

import java.util.List;

public class Example1_findSum {
    public static int sum(List<Integer> ints) {//type parameters must always be bound to reference types, not primitive types
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        return s;
    }

    public static Integer sumInteger(List<Integer> ints) {
        Integer s = 0;
        for (Integer n : ints) {//each iteration of the loop unboxes the values in s and n
            s += n;
        }
        return s;
    }
}
