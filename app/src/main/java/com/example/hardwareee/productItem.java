package com.example.hardwareee;

public class productItem {
    String product_ID;
    String product_Category;

    String product_Name;
    String product_Measurement;
    String product_Price;
    String product_Stock_Value;
    String product_Description;

    public productItem() {
    }


    public String getProduct_ID() {
        return product_ID;
    }

    public void setProduct_ID(String product_ID) {
        this.product_ID = product_ID;
    }

    public String getProduct_Category() {
        return product_Category;
    }

    public void setProduct_Category(String product_Category) {
        this.product_Category = product_Category;
    }

    public String getProduct_Name() {
        return product_Name;
    }

    public void setProduct_Name(String product_Name) {
        this.product_Name = product_Name;
    }

    public String getProduct_Measurement() {
        return product_Measurement;
    }

    public void setProduct_Measurement(String product_Measurement) {
        this.product_Measurement = product_Measurement;
    }

    public String getProduct_Price() {
        return product_Price;
    }

    public void setProduct_Price(String product_Price) {
        this.product_Price = product_Price;
    }

    public String getProduct_Stock_Value() {
        return product_Stock_Value;
    }

    public void setProduct_Stock_Value(String product_Stock_Value) {
        this.product_Stock_Value = product_Stock_Value;
    }

    public String getProduct_Description() {
        return product_Description;
    }

    public void setProduct_Description(String product_Description) {
        this.product_Description = product_Description;
    }

    public productItem(String product_ID, String product_Category, String product_Name,
                       String product_Measurement, String product_Price,
                       String product_Stock_Value, String product_Description) {

        this.product_ID = product_ID;
        this.product_Category = product_Category;
        this.product_Name = product_Name;
        this.product_Measurement = product_Measurement;
        this.product_Price = product_Price;
        this.product_Stock_Value = product_Stock_Value;
        this.product_Description = product_Description;


    }
}
