package com.stitchlee.design;

import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci(10);
        Iterator<Integer> iterator = fibonacci.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
