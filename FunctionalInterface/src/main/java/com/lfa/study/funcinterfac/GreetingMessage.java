package com.lfa.study.funcinterfac;

import java.io.IOException;
import java.io.PrintWriter;

@FunctionalInterface
public interface GreetingMessage {
    public abstract void greeting(String name);
    public default void print(String text) {
        System.out.println(text);
    }

    public static void print(String text, PrintWriter writer) throws IOException {
        writer.write(text);
    }
}
