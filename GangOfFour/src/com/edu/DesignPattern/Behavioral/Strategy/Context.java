package com.edu.DesignPattern.Behavioral.Strategy;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void performStrategy(){
        strategy.processAlgorithm();
    }
}
