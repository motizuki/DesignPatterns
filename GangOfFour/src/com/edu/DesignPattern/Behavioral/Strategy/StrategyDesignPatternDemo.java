package com.edu.DesignPattern.Behavioral.Strategy;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class StrategyDesignPatternDemo {
    public static void main(String[] args) {

        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.performStrategy();

        context.setStrategy(new ConcreteStrategyB());
        context.performStrategy();


    }
}
