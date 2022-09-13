package com.stitchlee.design;

/**
 * 咖啡的"装饰器"，可以给咖啡添加各种"配料"
 */
public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;

    /**
     * 在构造方法中，初始化咖啡对象的引用
     */
    public CoffeeDecorator(Coffee coffee) {
        decoratedCoffee = coffee;
    }

    /**
     * 装饰器父类中直接转发"请求"至引用对象
     */
    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getIngredients() {
        return decoratedCoffee.getIngredients();
    }
}
