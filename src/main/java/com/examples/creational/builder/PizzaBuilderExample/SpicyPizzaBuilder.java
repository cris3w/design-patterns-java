package com.examples.creational.builder.PizzaBuilderExample;

// Concrete Builder
public class SpicyPizzaBuilder extends PizzaBuilder {

    public void buildDough() {
        pizza.setDough("pan baked");
    }

    public void buildSauce() {
        pizza.setSauce("hot");
    }

    public void buildTopping() {
        pizza.setTopping("pepperoni+salami");
    }
}
