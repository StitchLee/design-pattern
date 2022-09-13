package com.stitchlee.design;

import com.stitchlee.design.decorator.WithMilk;
import com.stitchlee.design.decorator.WithSugar;
import com.stitchlee.design.impl.SimpleCoffee;

public class DecoratorDemo {

    static void print(Coffee c) {
        System.out.println("花费了: " + c.getCost());
        System.out.println("配料: " + c.getIngredients());
        System.out.println("============");
    }

    public static void main(String[] args) {
        //原味咖啡
        Coffee c = new SimpleCoffee();
        print(c);

        //增加牛奶的咖啡
        c = new WithMilk(c);
        print(c);

        //再加一点糖
        c = new WithSugar(c);
        print(c);
    }
}
