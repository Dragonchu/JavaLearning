package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section2_MaximumOfaCollection;

import java.util.Collection;
import java.util.Collections;

public class Example3_MaximizeUtilMax {
    public static <T extends Comparable<? super T>> T max(Collection<? extends T> coll) {
        return null;
    }
}
