package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section1_SubtypingAndTheSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Example2_ListSubtype {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        //List<Number> nums = ints; compile-time error

    }
}
