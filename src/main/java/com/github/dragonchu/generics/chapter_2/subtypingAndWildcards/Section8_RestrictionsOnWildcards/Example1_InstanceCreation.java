package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section8_RestrictionsOnWildcards;

import java.util.*;

public class Example1_InstanceCreation {
    public static void main(String[] args) {
        //List<?> list = new ArrayList<?>(); compile-time error
        //Map<String,? extends Number> map = new HashMap<String,? extends Number>(); compile-time error

        List<Number> nums = new ArrayList<>();
        List<? super Number> sink = nums;
        List<? extends Number> source = nums;
        for(int i = 0;i<10;i++){
            sink.add(i);
        }
        double sum = 0;
        for(Number num : source){
            sum += num.doubleValue();
        }

        List<List<?>> lists = new ArrayList<>();
        lists.add(Arrays.asList(1,2,3));
        lists.add(Arrays.asList("four","five"));
        assert lists.toString().equals("[[1, 2, 3], [four, five]]");

        List<?> list = new ArrayList<>();
        //List<?> list = new List<>(); compile-time error
        //List<?> list = new ArrayList<>(); compile-time error
    }
}
