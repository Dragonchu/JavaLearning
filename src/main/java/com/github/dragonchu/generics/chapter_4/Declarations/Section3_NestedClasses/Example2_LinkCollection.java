package com.github.dragonchu.generics.chapter_4.Declarations.Section3_NestedClasses;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

//this is preferable than Example1
public class Example2_LinkCollection<E> extends AbstractCollection<E> {
    private static class Node<T> {
        private T element;
        private Node<T> next = null;

        private Node(T elt) {
            this.element = elt;
        }
    }

    private Node<E> first = new Node<>(null);
    private Node<E> last = first;
    private int size = 0;

    public Example2_LinkCollection() {
    }

    public Example2_LinkCollection(Collection<? extends E> c) {
        addAll(c);
    }

    private static class LinkedIterator<T> implements Iterator<T> {
        private Node<T> current;

        public LinkedIterator(Node<T> first) {
            current = first;
        }

        @Override
        public boolean hasNext() {
            return current.next != null;
        }

        @Override
        public T next() {
            if (current.next != null) {
                current = current.next;
                return current.element;
            } else throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean add(E etl) {
        last.next = new Node<>(etl);
        last = last.next;
        size++;
        return true;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedIterator<>(first);
    }

    @Override
    public int size() {
        return size;
    }
}
