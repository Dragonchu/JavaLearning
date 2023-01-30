package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section7_WildcardCapture;

import java.util.ArrayList;
import java.util.List;

public class Example1_reverseOne {
    public static void main(String[] args) {

    }

    public static <T> void reverse(List<T> list) {
        List<T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size() - i - 1));
        }
    }
}
