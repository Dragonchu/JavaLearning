package com.github.dragonchu.generics.chapter_1.Introduction.Section2_BoxingAndUnboxing;

import java.util.Arrays;
import java.util.List;

import static com.github.dragonchu.generics.chapter_1.Introduction.Section2_BoxingAndUnboxing.Example1_findSum.*;

public class Example2_differentBetweenPrimitiveAndReference {
    public static void main(String[] args) {
        List<Integer> bigs = Arrays.asList(100,200,300);
        assert sumInteger(bigs) == sum(bigs);
        assert sumInteger(bigs) != sumInteger(bigs);
    }
}
