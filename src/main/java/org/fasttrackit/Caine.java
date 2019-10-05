package org.fasttrackit;

public class Caine extends Animal {

    private String race;


    public Caine(String name) {
        super(name);
    }

    @Override
    public String positiveMood() {
        return "Dog swinging his tail.";
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


}
