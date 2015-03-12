package com.edu.designpattern.behavioral.strategy;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class ConcreteStrategyA implements Strategy
{
    @Override
    public void processAlgorithm() {
        System.out.println("Processing Algorithm A...");
    }
}
