package com.edu.common.exampleclasses;

import com.edu.annotations.ApplicationService;

/**
 * Created by gustavokm90 on 11/2/14.
 */
@ApplicationService
public class Oven implements WhiteGoods{

    private int potency;
    private double price;

    public Oven(){
        this.setPrice(1000);
        this.setPotency(300);
    }

    @Override
    public String energyUsage() {
        return "This white good consume "+getPotency()+" cubic meter of gas per hour";
    }

    @Override
    public String price() {
        return "This white good cost $"+getPrice();
    }

    public String bake(){
        return "Baking...";
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
