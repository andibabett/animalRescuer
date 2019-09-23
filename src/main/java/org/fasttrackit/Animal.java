package org.fasttrackit;

class Animal {

    private String name;
    private int health;
    private double hunger;
    private double age;
    private double mood;
    private double weight;

    //constructor
    public Animal(int health, double hunger, int mood) {
        this.health = health;
        this.hunger = hunger;
        this.mood = mood;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void mood(int health, double hunger){
        mood = health + hunger;
        System.out.println("If" + getName()+ "is healthy, he's mood is" + mood );
    }
    public void mood() {
        System.out.println(name + "this is mood");
    }
// get-set
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

    public void setMood(int mood) {
        this.mood = mood;
    }

    public double getWeight(Object o) {
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