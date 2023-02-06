package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section3_FruityExample.ProhibitingComparsionOfApplesWithOranges;

abstract class Fruit {
    protected String name;
    protected int size;
    protected Fruit(String name,int size){
        this.name = name;
        this.size = size;
    }
    protected int compareTo(Fruit that){
        return this.size < that.size ? -1 :
                this.size == that.size ? 0 : 1;
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof Fruit){
            Fruit that = (Fruit) o;
            return this.name.equals(that.name) && this.size == that.size;
        }else{
            return false;
        }
    }
    @Override
    public int hashCode(){
        return name.hashCode()*29+size;
    }
}
