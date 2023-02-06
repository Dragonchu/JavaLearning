package com.github.dragonchu.generics.chapter_3.ComparisonAndBounds.Section6_MultipleBounds;

import java.io.Closeable;
import java.io.IOException;
import java.nio.CharBuffer;

public class Example1_copy {
    public static <S extends Readable & Closeable,T extends Appendable & Closeable> void copy(S src, T trg, int size) throws IOException {
        try{
            CharBuffer buf = CharBuffer.allocate(size);
            int i = src.read(buf);
            while (i>=0){
                buf.flip();
                trg.append(buf);
                buf.clear();
                i = src.read(buf);
            }
        }   finally {
            src.close();
            trg.close();
        }
    }
}
