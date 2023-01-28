package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section3_wildcardsWithSuper;

import java.util.Arrays;
import java.util.List;

public class Example1_Copy {
    public static void main(String[] args) {
        List<Object> objs = Arrays.asList(2,3,14,"four");
        List<Integer> ints = Arrays.asList(5,6);
        copy(objs,ints);
        assert objs.toString().equals("[5, 6, four]");
    }

    public static <T> void copy(List<? super T> dst, List<? extends T> src) {
        for (int i = 0; i < src.size(); i++) {
            dst.set(i, src.get(i));
        }
    }
}
