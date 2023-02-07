package com.github.dragonchu.generics.chapter_4.Declarations.Section2_StaticMembers;

public class Example2_Cell<T> {
    private final int id;
    private final T value;
    private static int count = 0;

    private static synchronized int nextId() {
        return count++;
    }

    public Example2_Cell(T value) {
        this.value = value;
        id = nextId();
    }

    public T getValue() {
        return this.value;
    }

    public int getId() {
        return this.id;
    }

    public static synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        Example2_Cell<String> a = new Example2_Cell<>("one");
        Example2_Cell<Integer> b = new Example2_Cell<>(2);
        assert a.getId() == 0 && b.getId() == 1 && Example2_Cell.getCount() == 2;
    }
}
