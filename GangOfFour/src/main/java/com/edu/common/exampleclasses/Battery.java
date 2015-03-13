package com.edu.common.exampleclasses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 11/5/14.
 * A type of product
 */
public abstract class Battery extends Product {

    private static final Logger logger = LoggerFactory.getLogger(Battery.class);
    protected Integer batterySize;
    protected Integer batteryCapacity;

    protected Battery(String productName, String fabCompany, Boolean perishable, Integer batterySize, Integer batteryCapacity) {
        super(productName, fabCompany, perishable);
        this.setBatterySize(batterySize);
        this.setBatteryCapacity(batteryCapacity);
    }


    public Integer getBatterySize() {
        return batterySize;
    }

    public void setBatterySize(Integer batterySize) {
        this.batterySize = batterySize;
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return super.toString()+"\n Battery{" +
                "batterySize=" + batterySize +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }

    @Override
    public void whoAmI(){
        logger.info("I am any battery");
    }
}
