package com.github.dragonchu.generics.chapter_1.Introduction.Section1_Generics;

import java.util.ArrayList;
import java.util.List;

public class Example4_addWordsWithGenerics {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Hello ");
        words.add("world! ");
        String s = words.get(0) + words.get(1);
        assert s.equals("Hello world!");
    }
}
