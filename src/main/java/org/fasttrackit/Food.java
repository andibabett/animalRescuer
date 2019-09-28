package org.fasttrackit;

import java.time.LocalDate;

public class Food {

    private String foodType;
    private double price;
    private double amount;
    private LocalDate expiryDate;

    // constructor
    public Food(String foodType, double price) {
        this.foodType = foodType;
        this.price = price;
    }

    //set-get
    public String getFoodType() {
        return foodType;
    }
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Food{" +
                "foodType='" + foodType + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
