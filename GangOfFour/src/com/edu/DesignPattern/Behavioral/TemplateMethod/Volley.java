package com.edu.DesignPattern.Behavioral.TemplateMethod;

/**
 * Created by gustavokm90 on 1/31/15.
 */
public class Volley extends Game {
    @Override
    void initialize() {
        System.out.println("Volley Game Initialized!");

    }

    @Override
    void start() {
        System.out.println("Volley Game Started!");

    }

    @Override
    void end() {
        System.out.println("Volley Game Finished!");

    }
}
