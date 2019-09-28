package org.fasttrackit;

public class Caine extends Animal {
    //parametrii
   private String race;


    //constructor
    public Caine(String race) {
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
