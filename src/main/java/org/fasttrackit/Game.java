package org.fasttrackit;


import javax.swing.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    private Vet vet;
    private Rescuer rescuer;
    private Animal animal;
    //    private List<Food> availableFood = new ArrayList<>();
    private RecreationalActivity[] recreationalActivity = new RecreationalActivity[2];


    Scanner in = new Scanner(System.in);


    private List<Food> availableFood = new ArrayList<Food>();
    private List<RecreationalActivity> availableActivities = new ArrayList<>();
    private Food chosenFood;

    public void initFood(Food food, Food food2) {
        availableFood.add(food);
        availableFood.add(food2);
    }

    public void availableFood() {
        System.out.println("Our available foods are:");
        for (Food availFood : availableFood) {
            if (availFood.getFoodType() != null) {
                System.out.println(availFood.getFoodType());
            }
        }
    }

    private void initActivity(RecreationalActivity recreationalActivity) {
        availableActivities.add(recreationalActivity);
    }

    public void avaibleActivities() {
        System.out.println("Our available activities are:");
        for (int i = 0; i < availableActivities.size(); i++) {
            if (availableActivities.get(i) != null) {
                System.out.println(availableActivities.get(i).getName());
            }
        }
    }


    private void initRescuer() {
        String name = null;
        int age = 0;
        try {
            System.out.println("Your character name is: ");
            name = in.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please submit a valid name");
            initRescuer();
        }
        rescuer = new Rescuer(name, age);
    }

    private void nameAnimal() {
        String name = null;
        try {
            System.out.println("Your animal a name is: ");
            name = in.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Please submit a valid name: ");
            nameAnimal();
        }
        animal.setName(name);
    }


    public void buyFood() {
        int foodChoise = 0;
        System.out.println("What food you want to by?");
        for (int i = 0; i < availableFood.size(); i++) {
            System.out.println((i + 1) + "." + availableFood.get(i).getFoodType() + ":" + availableFood.get(i).getPrice());
        }
        System.out.println(availableFood.size() + 1 + ". None of.");
        try {
            System.out.println("Choose the food :");
            foodChoise = in.nextInt() - 1;
        } catch (InputMismatchException Exception) {
            System.out.println("Please choose a valid food!");
            buyFood();
        }
        if (foodChoise < availableFood.size()) {
            System.out.println("Your food choice is " + availableFood.get(foodChoise).getFoodType() + ", price: " + availableFood.get(foodChoise).getPrice());
            System.out.println("Do you want to buy it?       1.YES   2.Choose another   3.NO");
            int buyFood = in.nextInt();
            if (buyFood == 1) {
                if ((rescuer.getAvaibleMoney() - availableFood.get(foodChoise).getPrice()) > 0) {
                    rescuer.setAvaibleMoney(rescuer.getAvaibleMoney() - availableFood.get(foodChoise).getPrice());
                    chosenFood = availableFood.get(foodChoise);
                    System.out.println("You bought " + availableFood.get(foodChoise).getFoodType());
                    System.out.println("Your new budget: " + rescuer.getAvaibleMoney());
                } else {
                    System.out.println("You don't have enough money.");
                    System.out.println("Do you want to choose another?  1.Yes   2.No");
                    int chooseAnother = in.nextInt();
                    if (chooseAnother == 1) buyFood();
                    else System.out.println("Thank you!:)");
                }
            } else if (buyFood == 2) buyFood();
            else System.out.println("You have chosen not to buy food. Thank you!");
        }
    }

    private void requireFeeding() {
        System.out.println("Feed " + animal.getName() + ".");
        if (chosenFood == null || chosenFood.getAmount() < 1) {
            System.out.println("You don't have enough food to feed " + animal.getName() + ".");
            System.out.println("Do you want to buy less quantity of food?   1.Yes   2.No");
            int buyFood = in.nextInt();
            if (buyFood == 1) {
                buyFood();
                System.out.println("Feed " + animal.getName() + "?      1.Yes    2.No");
                int feedAnimal = in.nextInt();
                if (feedAnimal == 1) requireFeeding();
            } else {
                System.out.println("You have chosen not to buy food.");
            }
        } else {
            System.out.println("Your available food is " + chosenFood.getFoodType() + ", quantity: " + chosenFood.getAmount());
            System.out.println("Do you feed " + animal.getName() + "? 1.YES   2.NO");
            int feedAnimal = in.nextInt();
            if (feedAnimal == 1) {
                rescuer.feed(animal, chosenFood);
            } else System.out.println("You have chosen not to feed " + animal.getName() + ".");
        }
    }

    private void requireActivity() {
        int activityChoice = 0;
        System.out.println("Play with your animal.");
        for (int i = 0; i < availableActivities.size(); i++) {
            System.out.println((i + 1) + ". " + availableActivities.get(i).getName());
        }
        System.out.println((availableActivities.size() + 1) + ". None of.");
        int notChoice = availableActivities.size();
        try {
            System.out.println("Choose activity:");
            activityChoice = in.nextInt() - 1;
        } catch (InputMismatchException Exception) {
            System.out.println("Please submit a valid number.");
            requireActivity();
        }
        if (activityChoice < availableActivities.size()) {
            System.out.println("Your activity choice is " + availableActivities.get(activityChoice).getName());
            rescuer.activity(animal, availableActivities.get(activityChoice));
        } else System.out.println("You can't play this with your animal.");
    }

    private void initAnimal() {
        int animalChoise = 0;
        int favoriteActivity = ThreadLocalRandom.current().nextInt(1, 2);
        int favoriteFood = ThreadLocalRandom.current().nextInt(1, 2);
        System.out.println("Choose an animal:");
        System.out.println("1. Dog");
        System.out.println("2. Cat");

        System.out.println("Taste your choose and press Enter.");
        animalChoise = in.nextInt();
        if (animalChoise == 1) {
            animal = new Caine("rex");
        } else if (animalChoise == 2) {
            animal = new Cat("lili");
        } else if (animalChoise == 3) {
        }

        if (animalChoise == 1) animal.setType("Caine");
        else if (animalChoise == 2) animal.setType("Cat");
        System.out.println("Your animal's type: " + animal.getType());

        System.out.print("Animals's age: ");
        animal.setAge(in.nextInt());
        animal.setAge(in.nextInt());

        if (animalChoise == 1) {
            Food food1 = new Food("Lidl", 20);
            Food food2 = new Food("Purina", 100);
            initFood(food1, food2);
            if (favoriteFood == 1) {
                animal.setFavoriteFood(food1.getFoodType());
            }
            if (favoriteFood == 2) {
                animal.setFavoriteFood(food2.getFoodType());
            }
        }
        if (animalChoise == 2) {
            Food food1 = new Food("Milk", 3.5);
            Food food2 = new Food("Whiskas", 36);
            initFood(food1, food2);
            if (favoriteFood == 1) {
                animal.setFavoriteFood(food1.getFoodType());
            }
            if (favoriteFood == 2) {
                animal.setFavoriteFood(food2.getFoodType());
            }
        }
        if (animalChoise == 1) {
            RecreationalActivity recreationalActivity1 = new RecreationalActivity("playWithBalls", 10);
            RecreationalActivity recreationalActivity2 = new RecreationalActivity("Run", 6);
            RecreationalActivity recreationalActivity3 = new RecreationalActivity("caressing", 8);
            initActivity(recreationalActivity1);
            initActivity(recreationalActivity2);
            initActivity(recreationalActivity3);
            if (favoriteActivity == 1) {
                animal.setFavoriteRecreationalActivity(recreationalActivity1.getName());
            }
            if (favoriteActivity == 2) {
                animal.setFavoriteRecreationalActivity(recreationalActivity2.getName());
            }
            if (favoriteActivity == 3) {
                animal.setFavoriteRecreationalActivity(recreationalActivity3.getName());
            }
        }
        if (animalChoise == 2) {
            RecreationalActivity recreationalActivity1 = new RecreationalActivity("Walk Outside", 2);
            RecreationalActivity recreationalActivity2 = new RecreationalActivity("Watch TV", 2);
            RecreationalActivity recreationalActivity3 = new RecreationalActivity("Ball Game", 2);
            initActivity(recreationalActivity1);
            initActivity(recreationalActivity2);
            initActivity(recreationalActivity3);
            if (favoriteActivity == 1) {
                animal.setFavoriteRecreationalActivity(recreationalActivity1.getName());
            }
            if (favoriteActivity == 2) {
                animal.setFavoriteRecreationalActivity(recreationalActivity2.getName());
            }
            if (favoriteActivity == 3) {
                animal.setFavoriteRecreationalActivity(recreationalActivity3.getName());
            }
        }
        if (animalChoise >= 3) animal.setMood(ThreadLocalRandom.current().nextInt(1, 50));
        else animal.setAge(ThreadLocalRandom.current().nextInt(1, 10));
        animal.setHealth(9);
        animal.setAge(ThreadLocalRandom.current().nextInt());
        animal.setWeight(3);
        animal.setHunger(2);

        System.out.println(animal.toString());
    }


    public void start() {
        intro();
        initRescuer();
        initAnimal();
        nameAnimal();
        int x = 0;
        boolean win = true;
        while (animal.getMood() < 20 && animal.getHunger() > 0 && x < 20) {
            requireFeeding();
            requireActivity();
            if (rescuer.getAvaibleMoney() < 1 || x >= 20) {
                System.out.println("You lost! :(");
                win = false;
                break;
            } else win = true;
            x++;
        }
        if (win) System.out.println("Congratulations! You won!!");
    }

    private void intro() {
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
        return availableActivities;
    }

    public void setAvaibleActivities(List<RecreationalActivity> avaibleActivities) {
        this.availableActivities = avaibleActivities;
    }
}