package org.fasttrackit;

import java.security.spec.RSAOtherPrimeInfo;

public class Game extends  RecreationalActivity{


   private String Rescuer;
   private String Dog;
   private String Vet;

    private Rescuer hugs;
   private Vet walking;

    public Game(double time, boolean sleep) {
        super(time, sleep);
    }


    public String getRescuer() {
        return Rescuer;
    }

    public void setRescuer(String rescuer) {
        Rescuer = rescuer;
    }

    public String getDog() {
        return Dog;
    }

    public void setDog(String dog) {
        Dog = dog;
    }

    public String getVet() {
        return Vet;
    }

    public void setVet(String vet) {
        Vet = vet;
    }

    public org.fasttrackit.Rescuer getHugs() {
        return hugs;
    }

    public void setHugs(org.fasttrackit.Rescuer hugs) {
        this.hugs = hugs;
    }

    public org.fasttrackit.Vet getWalking() {
        return walking;
    }

    public void setWalking(org.fasttrackit.Vet walking) {
        this.walking = walking;
    }


}
