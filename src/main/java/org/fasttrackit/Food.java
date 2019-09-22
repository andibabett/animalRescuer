package org.fasttrackit;

public class Food<localDate> {


    private String foodType;
    private double price;
    private double amount;
    private localDate expiryDate;



    public Food(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public double getPrice() { return price;    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getExpiryDate() {
        return (double) expiryDate;
    }

    public void setExpiryDate(double expiryDate, localDate localDate) {
        this.expiryDate = localDate;
    }

    public void localDate() {
    }

}
