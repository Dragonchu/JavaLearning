package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section4_GetAndPutPrinciple;

import java.util.Arrays;
import java.util.List;

public class Example7_GetObjectWithSuper {
    public static void main(String[] args) {
        List<Object> objs = Arrays.asList(1,"two");
        List<? super Integer> ints = objs;
        String str = "";
        for (Object obj: ints){
            str += obj.toString();
        }
        assert str.equals("1two");
    }
}
