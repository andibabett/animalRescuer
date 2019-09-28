package org.fasttrackit;

public class Caine extends Animal {
    //parametrii
    private String race;

    //constructor


    public Caine(int health, int hunger, int mood) {
        super(health, hunger, mood);
    }

    //set-get

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Caine{" +
                "race='" + race + '\'' +
                '}';
    }


}
