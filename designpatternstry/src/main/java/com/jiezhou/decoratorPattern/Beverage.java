package com.jiezhou.decoratorPattern;

/**
 * 饮料
 */
public abstract class Beverage {
    String description = "UnKnow Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
