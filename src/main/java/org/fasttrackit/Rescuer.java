package org.fasttrackit;

public class Rescuer extends Person {
    //parametrii
    private String name;
    private double avaibleMoney;
    private String place;

    //constructor
    public Rescuer(String name, int age, double avaibleMoney) {
        this.avaibleMoney = avaibleMoney;
        this.name = name;
        this.setAge(age);
    }
    public static void main(String[] args){}
    //metoda
    public void feed(Animal animal, Food foodtype) {
        animal.setHunger(animal.getHunger() - 1);
        System.out.println(getName() + "gave some" + foodtype.getFoodType() + "food to" + animal.getName());
    }

    public void activity(Animal animal, RecreationalActivity recreationalActivity) {
        System.out.println(getName() + "have some" + recreationalActivity.getName() + "with" + animal.getName());
    }

    //get-set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

    @Override
    public String toString() {
        return "Rescuer{" +
                "name='" + name + '\'' +
                ", avaibleMoney=" + avaibleMoney +
                ", place='" + place + '\'' +
                '}';
    }
}





