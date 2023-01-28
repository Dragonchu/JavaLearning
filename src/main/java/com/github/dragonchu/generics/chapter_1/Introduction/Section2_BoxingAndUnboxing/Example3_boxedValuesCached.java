package com.github.dragonchu.generics.chapter_1.Introduction.Section2_BoxingAndUnboxing;

import java.util.Arrays;
import java.util.List;

import static com.github.dragonchu.generics.chapter_1.Introduction.Section2_BoxingAndUnboxing.Example1_findSum.*;

public class Example3_boxedValuesCached {
    public static void main(String[] args) {
        //Caching is required when boxing an int or short value between -128 and 127
        //a char value between \u0000 and \u007f
        //a byte
        //or a boolean
        //and cacheing is permitted when boxing other values
        List<Integer> smalls = Arrays.asList(1,2,3);
        assert sumInteger(smalls) == sum(smalls);
        assert sumInteger(smalls) == sumInteger(smalls);
    }
}
