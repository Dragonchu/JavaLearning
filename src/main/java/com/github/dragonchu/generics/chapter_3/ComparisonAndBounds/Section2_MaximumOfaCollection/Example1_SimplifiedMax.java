package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section2_MaximumOfaCollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example1_SimplifiedMax {
    public static <T extends Comparable<T>> T max(Collection<T> coll){//T is bounded by Comparable<T>
        T candidate = coll.iterator().next();
        for(T elt:coll){
            if(candidate.compareTo(elt)<0){
                candidate = elt;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(0,1,2);
        assert Collections.max(ints) == 2;
        List<String> strs = Arrays.asList("zero","one","two");
        assert Collections.max(strs).equals("zero");
    }
}
