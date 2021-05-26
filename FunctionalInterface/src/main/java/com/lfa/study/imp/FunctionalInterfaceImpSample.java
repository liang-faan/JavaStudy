package com.lfa.study.imp;

import com.lfa.study.funcinterfac.GreetingMessage;

/**
 * @author lanphan
 */

public class FunctionalInterfaceImpSample {

    public static void main(String[] args) {

        /**
         * Lambda implementation
         */
        GreetingMessage message = (name) -> {
            System.out.println(name);
        };

        message.greeting("Hello");

        /**
         * Original implementation via method definition
         */
        GreetingMessage message1 = new GreetingMessage() {
            @Override
            public void greeting(String name) {
                System.out.println(name);
            }
        };
        message1.greeting("Hello");
        message1.print("World");
    }
}
