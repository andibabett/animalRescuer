package org.fasttrackit;

class Animal {

    private String name;
    private int health;
    private double hunger;
    private double age;
    private int mood;
    private double weight;

    public Animal() {
        super();
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

    public void setHunger(double hunger) {
        this.hunger = hunger;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getMood(int i) {
        return mood;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public double getWeight(Object o) {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }


    public Animal(int mood) {
        getMood(5);



    }

    public int getMood() {
        return mood;
    }
}