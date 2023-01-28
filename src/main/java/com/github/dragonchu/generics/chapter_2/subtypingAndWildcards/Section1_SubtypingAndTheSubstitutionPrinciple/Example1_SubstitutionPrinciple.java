package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section1_SubtypingAndTheSubstitutionPrinciple;

import java.util.ArrayList;
import java.util.List;

public class Example1_SubstitutionPrinciple {
    public static void main(String[] args) {
        //List<Number> is subtype of Collection<Number>
        List<Number> nums = new ArrayList<>();
        nums.add(2);// 2 is Integer(boxing), which is subtype of Number
        nums.add(3.14);// 3.14 is Double(boxing), which is subtype of Number
        assert nums.toString().equals("[2, 3.14]");
    }
}
