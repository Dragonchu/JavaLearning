package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section4_Comparator;

import java.util.Comparator;

public class Example1_Comparator{
    public static void main(String[] args) {
        Comparator<String> sizeOrder = new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return s.length() < t1.length() ? -1 :
                        s.length() > t1.length() ? 1 :
                                s.compareTo(t1);
            }
        };

        assert "two".compareTo("three") > 0;
        assert sizeOrder.compare("two", "three") < 0;
    }
}
