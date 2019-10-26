package org.fasttrackit;

public class Rescuer extends Person {
    //parametrii
    private String name;
    private double avaibleMoney;
    private String place;

    //constructor
    public Rescuer(String name, int age) {
        this.name = name;
        this.setAge(age);
    }
    public static void main(String[] args){}
    //metoda
    public void feed(Animal animal, Food food) {
        animal.setHunger(animal.getHunger() - 1);
        System.out.println(getName() + "gave some" + food.getFoodType() + "food to" + animal.getName());
        if (animal.getFavoriteFood().equals(food.getFoodType()))
        {
            animal.setMood(animal.getMood()+ 2);
            System.out.println(animal.getName()+"'s mood after she receives "+animal.getFavoriteFood()+ "is" + animal.getMood());
        }
    }

    public void activity(Animal animal, RecreationalActivity recreationalActivity) {
        System.out.println(getName() + "have some" + recreationalActivity.getName() + "with" + animal.getName());
        animal.setMood(animal.getMood() + recreationalActivity.getMoodIncrease());
        if (animal.getFavoriteRecreationalActivity().equals(recreationalActivity.getName()))
        {
            animal.setMood(animal.getMood()+recreationalActivity.getMoodIncrease()+2);
        }
        else animal.setMood(animal.getMood()+recreationalActivity.getMoodIncrease());
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





