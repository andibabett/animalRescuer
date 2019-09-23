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
    public void recreationalActivity(RecreationalActivity activity, Animal animal) {
        System.out.println(name + "play" + activity.getName() + "cu animalul" + animal.getName());
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





