package com.edu.DesignPattern.Behavioral.Visitor;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class VisitorDesignPatternDemo {
    public static void main(String[] args) {

        Visited visited = new Visited();

        visited.accept(new Visitor());

    }
}
