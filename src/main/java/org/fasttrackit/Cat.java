package org.fasttrackit;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public Cat(int health, int hunger, int mood) {
        super(health, hunger, mood);
    }

    @Override
    public double mood(double mood, Rescuer rescuer, RecreationalActivity recreationalActivity) {
        return super.mood(mood, rescuer, recreationalActivity);
    }
}
