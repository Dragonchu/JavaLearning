package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section8_CovariantOverriding;

import java.lang.reflect.Method;

public class Example1_Point {
    public int x;
    public int y;
    public Example1_Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public Example1_Point clone(){
        return new Example1_Point(x,y);
    }

    public static void main(String[] args) {
        for(Method m: Example1_Point.class.getMethods()){
            if(m.getName().equals("clone")){
                System.out.println(m.toGenericString());
            }
        }
    }
}
