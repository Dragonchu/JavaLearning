package com.github.dragonchu.generics.chapter_1.Introduction.Section3_Foreach;

import java.util.Iterator;
import java.util.List;

public class Example1_dotProductOfTwoVectors {
    public static double dot(List<Double> u,List<Double> v){
        if (u.size() != v.size())
            throw new IllegalArgumentException("different sizes");
        double d = 0;
        Iterator<Double> uIt = u.iterator();
        Iterator<Double> vIt = v.iterator();
        while(uIt.hasNext()){
            assert uIt.hasNext() && vIt.hasNext();
            d += uIt.next() * vIt.next();
        }
        assert !uIt.hasNext() && !vIt.hasNext();
        return d;
    }
}
