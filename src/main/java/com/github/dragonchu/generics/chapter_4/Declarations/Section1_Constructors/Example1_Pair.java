package com.github.dragonchu.generics.chapter_4.Declarations.Section1_Constructors;

public class Example1_Pair<T,U> {
    private final T first;
    private final U second;
    public Example1_Pair(T first,U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public U getSecond(){
        return second;
    }

    public static void main(String[] args) {
        Example1_Pair<String,Integer> pair = new Example1_Pair<>("one",2);
        assert pair.getFirst().equals("one") && pair.getSecond() == 2;
    }
}
