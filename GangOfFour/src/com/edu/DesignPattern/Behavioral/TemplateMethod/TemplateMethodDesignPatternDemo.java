package com.edu.DesignPattern.Behavioral.TemplateMethod;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class TemplateMethodDesignPatternDemo {
    public static void main(String[] args) {

        Game game = new Soccer();
        game.play();

        game = new Volley();
        game.play();
    }
}
