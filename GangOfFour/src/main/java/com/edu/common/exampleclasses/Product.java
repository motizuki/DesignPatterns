package com.edu.common.exampleclasses;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by gustavokm90 on 11/5/14.
 * Standard product class
 */
public abstract class Product {

    private static final Logger logger = LoggerFactory.getLogger(Product.class);


    protected String productName;
    protected String fabCompany;
    protected Boolean perishable;

    protected Product(String productName, String fabCompany, Boolean perishable) {
        this.productName = productName;
        this.fabCompany = fabCompany;
        this.perishable = perishable;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFabCompany() {
        return fabCompany;
    }

    public void setFabCompany(String fabCompany) {
        this.fabCompany = fabCompany;
    }

    public void setPerishable(Boolean perishable) {
        this.perishable = perishable;
    }

    public Boolean isPerishable(){
        return perishable;
    }

    public void whoAmI(){
        logger.info("I am any product");
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", fabCompany='" + fabCompany + '\'' +
                ", perishable=" + perishable +
                '}';
    }
}

