package com.stitchlee.design;

import java.util.Iterator;

/**
 * Fibonacci 数列的"容器"，通过构造器传入整数值设置该对象保存多少个数。
 * JDK提供了现成的Iterable接口,实现该接口即可获取Fibonacci对象的迭代器。
 */
public class Fibonacci implements Iterable<Integer> {

    /** 需要取多少数字 */
    private final int count;

    public Fibonacci(int count) {
        this.count = count;
    }

    private int fib(int n) {
        if (n <= 2) {
            return 1;
        }
        return fib(n - 2) + fib(n - 1);
    }

    /** 根据该方法获取迭代器 */
    @Override
    public Iterator<Integer> iterator() {
        // 使用匿名内部类实现自己的遍历算法
        return new Iterator<Integer>() {
            int n = 1;
            int total = count;

            @Override
            public boolean hasNext() {
                return total > 0;
            }

            @Override
            public Integer next() {
                if (total-- > 0) {
                    return fib(n++);
                }
                throw new RuntimeException("no more!");
            }
        };
    }
}
