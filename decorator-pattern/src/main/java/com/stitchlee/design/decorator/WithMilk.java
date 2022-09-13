package com.stitchlee.design.decorator;

import com.stitchlee.design.Coffee;
import com.stitchlee.design.CoffeeDecorator;

/**
 * 此装饰类混合"牛奶"到原味咖啡中
 */
public class WithMilk extends CoffeeDecorator {

    public WithMilk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        double additionalCost = 0.5;
        return super.getCost() + additionalCost;
    }

    @Override
    public String getIngredients() {
        String additionalIngredient = "milk";
        return super.getIngredients() + ", " + additionalIngredient;
    }
}