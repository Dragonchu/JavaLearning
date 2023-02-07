package com.github.dragonchu.generics.chapter_4.Declarations.Section2_StaticMembers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example1_Erasure {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1,2,3);
        List<String> strings = Arrays.asList("one","two");
        assert ints.getClass() == strings.getClass();
    }
}
