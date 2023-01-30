package com.github.dragonchu.generics.chapter_2.subtypingAndWildcards.Section6_WildcardsVersusTypeParameters;

import java.util.Collection;

interface Example3_MyCollection<E> {
    boolean contains(E o);//ints.contains(obj) will cause compile-error
    boolean containsAll(Collection<? extends E> c);//ints.containsAll(objs) will cause compile-error
}
