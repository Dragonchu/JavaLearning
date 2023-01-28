package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section4_GetAndPutPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Example5_WrongUsageWithSuper {
    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3);
        //double dbl = Example1_Sum.sum(ints); compile-time error
    }
}
