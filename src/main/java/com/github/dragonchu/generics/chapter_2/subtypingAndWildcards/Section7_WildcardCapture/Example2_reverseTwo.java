package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section7_WildcardCapture;

import java.util.ArrayList;
import java.util.List;

public class Example2_reverseTwo {
    public static void reverse(List<?> list) {
        rev(list);
    }

    private static <T> void rev(List<T> list) {
        List<T> tmp = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
            list.set(i, tmp.get(list.size() - i - 1));
        }
    }
}