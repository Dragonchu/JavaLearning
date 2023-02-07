package com.github.dragonchu.generics.chapter_4.Declarations.Section3_NestedClasses;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Example1_LinkedCollection<E> extends AbstractCollection<E> {
    private class Node {
        private E element;
        private Node next = null;

        private Node(E elt) {
            this.element = elt;
        }
    }

    private Node first = new Node(null);
    private Node last = first;
    private int size = 0;

    public Example1_LinkedCollection() {
    }

    public Example1_LinkedCollection(Collection<? extends E> c) {
        addAll(c);
    }

    @Override
    public boolean add(E etl) {
        last.next = new Node(etl);
        last = last.next;
        size++;
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private Node current = first;

            @Override
            public boolean hasNext() {
                return current.next != null;
            }

            @Override
            public E next() {
                if (current.next != null) {
                    current = current.next;
                    return current.element;
                } else throw new NoSuchElementException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public int size() {
        return size;
    }
}
