package com.edu.common.exampleclasses.concreteclasses;

import com.edu.common.exampleclasses.WhiteGoods;

/**
 * Created by gustavokm90 on 11/2/14.
 */
public class Fridge implements WhiteGoods {

    private int potency;
    private double price;

    public Fridge(){
        this.setPrice(500);
        this.setPotency(200);
    }

    @Override
    public String energyUsage() {
        return "This white good consume "+getPotency()*100+" energy per hour";
    }

    @Override
    public String price() {
        return "This white good cost $"+getPrice();
    }

    public String freezing(){
        return "Freezing...";
    }

    public int getPotency() {
        return potency;
    }

    public void setPotency(int potency) {
        this.potency = potency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
