package org.fasttrackit;

public class Caine extends Animal {
    //parametrii
    private String name;
    private double age;

    //constructor
    public Caine(int health, double hunger, int mood, String name, int age) {
        super(health, hunger, mood);
        this.name = name;
        this.age = age;
    }
    //set-get
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge() {
        return age;
    }
    public void setAge(double age) {
        this.age = age;
    }

    @Override
    public void mood() {

    }
}
