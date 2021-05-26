package com.lfa.study.funcinterfac;

import com.lfa.study.methodRef.Square;

@FunctionalInterface
public interface Shapes {
    abstract int getArea(Square square);
}
