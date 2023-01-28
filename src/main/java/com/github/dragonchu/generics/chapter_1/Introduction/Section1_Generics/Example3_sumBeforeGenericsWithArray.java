package com.github.dragonchu.generics.chapter_1.Introduction.Section1_Generics;

public class Example3_sumBeforeGenericsWithArray {
    public static void main(String[] args) {
        int[] ints = new int[]{1,2,3};
        int s = 0;
        for(int i = 0;i<ints.length;i++){
            s+=ints[i];
        }
        assert s == 6;
    }
}
