package org.fasttrackit;

import javax.sound.midi.Soundbank;

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
    public void feed(Animal animal, Food foodtype, double hunger) {
        System.out.println(name + "gave some" + foodtype + "food to" + animal.getName());
        if (feed(); = animal.getHunger() + 1 ;)
        System.out.println("If wee feed" + animal.getName() + "with" + foodtype + "hi's hunger will be" + animal.getHunger());
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





