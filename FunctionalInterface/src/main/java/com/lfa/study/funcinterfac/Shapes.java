package com.lfa.study.funcinterfac;

import com.lfa.study.methodRef.Square;

/**
 * Functional Interfaces going to be used for Method reference implementation
 */

@FunctionalInterface
public interface Shapes {
    abstract int getArea(Square square);
}
