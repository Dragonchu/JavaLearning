package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section7_Bridges;

import java.lang.reflect.Method;

public class Example1_SeeBridges {
    public static void main(String[] args) {
        for(Method m: Integer.class.getMethods()){
            if(m.getName().equals("compareTo")){
                System.out.println(m.toGenericString());
            }
        }
    }
}
