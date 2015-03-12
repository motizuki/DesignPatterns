package com.edu.designpattern.behavioral.observer;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class ObserverDesignPatternDemo {
    public static void main(String[] args) {

        Publish publish = new Publish();

        Subscriber fooSubscriber = new FooSubscriber(publish);
        Subscriber booSubscriber = new BooSubscriber(publish);

        System.out.println("Chaging the state of the publisher...");
        publish.setState(999);
        System.out.println("Chaging the state of the publisher...");
        publish.setState(111);


    }
}
