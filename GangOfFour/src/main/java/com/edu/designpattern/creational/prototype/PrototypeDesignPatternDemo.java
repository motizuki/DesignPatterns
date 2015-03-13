package com.edu.designpattern.creational.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 11/6/14.
 */
public class PrototypeDesignPatternDemo {

    private static final Logger logger = LoggerFactory.getLogger(PrototypeDesignPatternDemo.class);

    public static void main (String[] args){

        Account1 acc1 = new Account1();
        Account1 acc2 = new Account1();
        Account1 acc3 = new Account1();

        acc1.setCustomerName("Carla");
        acc2.setCustomerName("Gustavo");
        acc3.setCustomerName("Norio");

        logger.info("Before Cloning");
        acc1.checkMoney();
        acc2.checkMoney();
        acc3.checkMoney();

        BankAccount clonedAcc1 = (BankAccount) acc1.clone();
        BankAccount clonedAcc2 = (BankAccount) acc2.clone();
        BankAccount clonedAcc3 = (BankAccount) acc3.clone();


        clonedAcc1.setCustomerName("Cloned Carla");
        clonedAcc2.setCustomerName("Cloned Gustavo");
        clonedAcc3.setCustomerName("Cloned Norio");

        logger.info("After Cloning");
        acc1.checkMoney();
        acc2.checkMoney();
        acc3.checkMoney();

        logger.info("Cloned instances");
        clonedAcc1.checkMoney();
        clonedAcc2.checkMoney();
        clonedAcc3.checkMoney();




    }

}
