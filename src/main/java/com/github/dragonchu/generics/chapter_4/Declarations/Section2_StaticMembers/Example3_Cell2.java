package com.github.dragonchu.generics.chapter_4.Declarations.Section2_StaticMembers;

import java.util.ArrayList;
import java.util.List;

public class Example3_Cell2<T>{
    private final T value;
    private static List<Object> values = new ArrayList<>();

    public Example3_Cell2(T value){
        this.value = value;
        values.add(value);
    }

    public T getValue(){
        return this.value;
    }

    public static List<Object> getValues(){
        return values;
    }

    public static void main(String[] args) {
        Example3_Cell2<String> a = new Example3_Cell2<>("one");
        Example3_Cell2<Integer> b = new Example3_Cell2<>(2);
        assert Example3_Cell2.getValues().toString().equals("[one, 2]");
    }
}
