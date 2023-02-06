package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section3_FruityExample.ProhibitingComparsionOfApplesWithOranges;

public class Apple extends Fruit implements Comparable<Apple>{
    protected Apple( int size) {
        super("Apple", size);
    }

    @Override
    public int compareTo(Apple apple) {
        return super.compareTo(apple);
    }
}
