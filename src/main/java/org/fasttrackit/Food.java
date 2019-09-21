package org.fasttrackit;

import java.time.LocalDate;

public class Food extends RecreationalActivity{


   private String foodType;
   private double price;
   private double amount;
    public localDate localDate;





    public Food(String foodType) {
        super(foodType);
        this.foodType = foodType;
    }

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

    public double getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(double expiryDate) {
        this.expiryDate = expiryDate;
    }

    public void localDate() {
    }
}
