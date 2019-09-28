package org.fasttrackit;

public class Caine extends Animal {
    //parametrii
   private String race;


    //constructor

    public Caine(int health, int hunger, int mood, String race) {
        super(health, hunger, mood);
        this.race = race;
    }

    public Caine(String name, String race) {
        super(name);
        this.race = race;
    }

    //set-get

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
