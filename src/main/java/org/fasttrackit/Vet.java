package org.fasttrackit;

public class Vet extends Person{



  private String specialization;
  private boolean experience;
  private double price;


    public Vet(int age, boolean experience) {
        this.age = age;
        this.experience = experience;
    }

    public Vet(String specialization) {
        this.specialization = specialization;
    }

    public void healAnimal(Animal animal) {
        animal.getMood(10);
        animal.getWeight(null);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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
}
