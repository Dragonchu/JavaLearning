package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section3_FruityExample.ProhibitingComparsionOfApplesWithOranges;

public class Orange extends Fruit implements Comparable<Orange>{
    protected Orange(int size) {
        super("Orange", size);
    }

    @Override
    public int compareTo(Orange orange) {
        return super.compareTo(orange);
    }
}
