package com.edu.DesignPattern.Creational.AbstractFactory.Products;

/**
 * Created by gustavokm90 on 11/2/14.
 */
public class Fridge implements WhiteGoods{

    private int potency;
    private double price;

    public Fridge(int potency,double price){
        this.setPrice(price);
        this.setPotency(potency);
    }

    @Override
    public int energyUsage() {
        return this.getPotency()*100;
    }

    @Override
    public double price() {
        return this.getPrice();
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
