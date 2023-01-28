package com.github.dragonchu.generics.chapter_1.Introduction.Section4_GenericMethodsAndVarargs;

import java.util.ArrayList;
import java.util.List;

public class Example1_Lists {
    public static <T> List<T> toList(T[] arr){//write <T> at the beginning of the method signature
        //The scope of the type variable T is local to the method it self.
        List<T> list = new ArrayList<>();
        for (T elt: arr){
            list.add(elt);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> ints = Example1_Lists.toList(new Integer[]{1,2,3});
        List<String> words = Example1_Lists.toList(new String[]{"hello","world"});
    }
}
