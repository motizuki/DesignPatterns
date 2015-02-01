package com.edu.DesignPattern.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gustavokm90 on 1/30/15.
 */
public class Publish {

    private List<Subscriber> subscriberList = new ArrayList<Subscriber>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllSubscribers();

    }

    public void attachSubscriber(Subscriber subscriber){
        this.subscriberList.add(subscriber);
    }

    public void notifyAllSubscribers(){
        for (Subscriber subscriber : this.subscriberList){
            subscriber.update();
        }
    }
}
