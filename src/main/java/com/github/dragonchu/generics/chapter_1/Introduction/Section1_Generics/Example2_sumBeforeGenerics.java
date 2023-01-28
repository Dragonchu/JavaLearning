package com.github.dragonchu.generics.chapter_1.Introduction.Section1_Generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Example2_sumBeforeGenerics {
    public static void main(String[] args) {
        List ints = Arrays.asList(new Integer[]{
                new Integer(1),new Integer(2),new Integer(3)
        });
        int s = 0;
        for (Iterator it = ints.iterator();it.hasNext();){
            int n = ((Integer)it.next()).intValue();
            s+=n;
        }
        assert s == 6;
    }
}
