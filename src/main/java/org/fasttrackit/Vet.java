package org.fasttrackit;

public class Vet extends Person {


    private String specialization;
    private boolean experience;
    private double price;


    // constructor
    public Vet (String specialization, boolean experience) {
        this.specialization = specialization;
        this.experience = experience;
    }

    // get-set
    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public boolean isExperience() {
        return experience;
    }

    public void setExperience(boolean experience) {
        this.experience = experience;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vet{" +
                "specialization='" + specialization + '\'' +
                ", experience=" + experience +
                ", price=" + price +
                '}';
    }

    public Vet() {
        super();
    }

}
