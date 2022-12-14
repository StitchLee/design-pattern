package com.stitchlee.design.decorator;

import com.stitchlee.design.Coffee;
import com.stitchlee.design.CoffeeDecorator;

public class WithSugar extends CoffeeDecorator {

    public WithSugar(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 1;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", Sugar";
    }
}
