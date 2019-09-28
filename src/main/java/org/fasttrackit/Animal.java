package org.fasttrackit;

class Animal {

    private String name;
    private int health;
    private int hunger;
    private double age;
    private double mood;
    private double weight;

    //constructor
    public Animal(int health, int hunger, int mood) {
        this.health = health;
        this.hunger = hunger;
        this.mood = mood;
    }


    // get-set
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public double getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public double getMood() {
        return mood;
    }

    public void setMood(double mood) {
        this.mood = mood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", hunger=" + hunger +
                ", age=" + age +
                ", mood=" + mood +
                ", weight=" + weight +
                '}';
    }

}