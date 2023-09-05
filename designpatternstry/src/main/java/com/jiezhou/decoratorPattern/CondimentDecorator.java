package com.jiezhou.decoratorPattern;

/**
 * 装饰者
 */
public abstract class CondimentDecorator extends Beverage{


    public abstract String getDescription();

    public abstract double cost() ;
}
