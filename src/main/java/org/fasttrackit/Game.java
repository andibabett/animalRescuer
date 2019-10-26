package org.fasttrackit;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    private Vet vet;
    private Rescuer rescuer;
    private Animal animal;

    Scanner in = new Scanner(System.in);


    private List<Food> availableFood = new ArrayList<Food>();

    private List<RecreationalActivity> avaibleActivities = new ArrayList<RecreationalActivity>();

    public void initFood(Food food, Food food2) {
        availableFood.add(food);
        availableFood.add(food2);
    }

    public void availableFood() {
        System.out.println("Our available foods are:");
        for (Food food : availableFood) {
            if (availableFood != null) {
                System.out.println(availableFood);
            }
        }
    }

    private void initRecreationalActivity(RecreationalActivity recreationalActivity) {
        avaibleActivities.add(recreationalActivity);
    }

    public void avaibleActivities() {
        System.out.println("Our available activities are:");
        for (int i = 0; i < avaibleActivities.size(); i++) {
            if (avaibleActivities.get(i) != null) {
                System.out.println(avaibleActivities.get(i).getName());
            }
        }
    }

    private void initRescuer() {
        String name = null;
        int age = 0;
        try {
            System.out.println("Give your character a name: ");
            name = in.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please submit a valid name!");
            initRescuer();
        }
        rescuer = new Rescuer(name, age);
    }

    private void newAnimal() {
        String name = null;
        try {
            System.out.println("Give your animal a name: ");
            name = in.nextLine();
        } catch (InputMismatchException Exception) {
            System.out.println("Please submit a valid name: ");
            animal.getName();
        }
        animal.setName(name);
    }


    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }

    public Rescuer getRescuer() {
        return rescuer;
    }

    public void setRescuer(Rescuer rescuer) {
        this.rescuer = rescuer;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public List<Food> getAvailableFood() {
        return availableFood;
    }

    public void setAvailableFood(List<Food> availableFood) {
        this.availableFood = availableFood;
    }

    public List<RecreationalActivity> getAvaibleActivities() {
        return avaibleActivities;
    }

    public void setAvaibleActivities(List<RecreationalActivity> avaibleActivities) {
        this.avaibleActivities = avaibleActivities;
    }
}