package com.github.dragonchu.generics.chapter_1.Introduction.Section1_Generics;

import java.util.Arrays;
import java.util.List;

public class Example1_sumWithGenerics {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 2, 3);//Boxing and unboxing operations are used to convert 1,2,3 to Integer
        int s = 0;
        for (int n : ints) {
            s += n;
        }
        assert s == 6;//assertion statement introduced in java 1.4
    }
}
