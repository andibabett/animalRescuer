package org.fasttrackit;

public class Vet {


    String name;
    String sex;
    int age;
    String specialization;
    int experience;
    double price;


    public Vet(int age, String experience) {
        this.age = age;
        this.experience = experience;
    }

    public Vet(String specialization) {
        this.specialization = specialization;
    }

    public void healAnimal(Animal animal) {
        animal.mood = 10;
        animal.weight = -;


    }

}
