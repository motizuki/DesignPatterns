package com.edu.designpattern.creational.prototype;

import java.util.Random;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class Account1 extends BankAccount{

    public Account1 (){
        id = new Random().nextInt();
    }

    @Override
    void checkMoney() {
        System.out.println("the account "+getId()+" from "+ getCustomerName() +" have: $"+getSavings());
    }
}
