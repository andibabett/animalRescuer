package org.fasttrackit;

public class Rescuer extends Person {
    //parametrii
    private double avaibleMoney;
    private String place;

    //constructor
   public Rescuer(double avaibleMoney, String place) {
       this.avaibleMoney = avaibleMoney;
        this.place = place;
    }

    //metoda
    public void feed(Animal animal, Food foodtype,) {
        System.out.println(getName() + "gave some" + foodtype + "food to" + animal.getName());

    }
    //get-set
    public double getAvaibleMoney() {
        return avaibleMoney;
    }

    public void setAvaibleMoney(double avaibleMoney) {
        this.avaibleMoney = avaibleMoney;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}





