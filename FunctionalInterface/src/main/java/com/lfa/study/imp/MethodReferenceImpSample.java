package com.lfa.study.imp;

import com.lfa.study.funcinterfac.Shapes;
import com.lfa.study.methodRef.Square;

public class MethodReferenceImpSample {

    public static void main(String[] args) {
        Square square1 = new Square(4);
        //Lambda reference implementation
        Shapes shape1 = (square) -> {
            return square1.calculateArea();
        };

        System.out.println(shape1.getArea(square1));

        //Method reference implementation
        Shapes shape2 = Square::calculateArea;
        System.out.println(shape2.getArea(square1));
    }
}
