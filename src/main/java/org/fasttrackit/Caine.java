package org.fasttrackit;

public class Caine extends Animal {

    private String race;


    public Caine(String name) {
        super(name);
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    @Override
    public String positiveMood() {
        if (getMood() > 8) {
            System.out.println(getName() + "is happy. He's swinging his tail.");
        } else {
            System.out.println(getName() + "nedd to play. Please play with" + getName());

        }
        return positiveMood();
    }

}