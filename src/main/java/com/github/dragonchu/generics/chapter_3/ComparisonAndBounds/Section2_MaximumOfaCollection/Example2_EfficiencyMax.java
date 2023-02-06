package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section2_MaximumOfaCollection;

import java.util.Collection;
import java.util.Iterator;

public class Example2_EfficiencyMax {
    public static <T extends Comparable<T>> T max(Collection<T> coll){
        Iterator<T> it = coll.iterator();
        T candidate = it.next();
        while(it.hasNext()){
            T etl = it.next();
            if(candidate.compareTo(etl)<0){
                candidate = etl;
            }
        }
        return candidate;
    }
}
