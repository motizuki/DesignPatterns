package com.edu.common.exampleclasses;

/**
 * Created by gustavokm90 on 11/5/14.
 * Standard product class
 */
public abstract class Product {

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
        System.out.println("I am any product");
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

