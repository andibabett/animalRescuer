package org.fasttrackit;

public class Caine extends Animal {

    private String race;

    public Caine(int health, int hunger, int mood) {
        super(health, hunger, mood);
    }

    public Caine(String name) {
        super(name);
    }

    @Override
    public double mood(double mood, Rescuer rescuer, RecreationalActivity recreationalActivity) {
        return super.mood(mood, rescuer, recreationalActivity);
    }


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


}
