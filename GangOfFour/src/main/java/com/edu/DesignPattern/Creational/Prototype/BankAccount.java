package com.edu.designpattern.creational.prototype;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public abstract class BankAccount implements Cloneable {

    protected int id;
    protected String customerName;
    protected int savings;

    abstract void checkMoney();

    public int getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getSavings() {
        return savings;
    }

    public void setSavings(int savings) {
        this.savings = savings;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;

    }
}
