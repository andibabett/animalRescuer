package org.fasttrackit;

public class Rescuer  {

    String name;
    String sex;
    int age;
    double avaibleMoney;
    String place;

    public Rescuer(int age) {
        this.age = age;
    }

    public void adoptAnimal(Animal animal){
        animal.mood = 10;
    }
}
