package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section8_RestrictionsOnWildcards;

import java.util.ArrayList;
import java.util.List;

public class Example2_GenericMethodCalls {
    public static void main(String[] args) {
        List<?> list = factory();
        List<?> list2 = Example2_GenericMethodCalls.<Object>factory();
        //List<?> list3 = Example2_GenericMethodCalls.<?>factory(); compile-time error
        List<List<?>> list4 = Example2_GenericMethodCalls.<List<?>>factory();
    }
    public static <T> List<T> factory(){
        return new ArrayList<>();
    }
}
