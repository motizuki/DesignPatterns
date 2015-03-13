package com.edu.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class Account1 extends BankAccount{

    private static final Logger logger = LoggerFactory.getLogger(Account1.class);

    public Account1 (){
        id = new Random().nextInt();
    }

    @Override
    void checkMoney() {
        logger.info("the account "+getId()+" from "+ getCustomerName() +" have: $"+getSavings());
    }
}
