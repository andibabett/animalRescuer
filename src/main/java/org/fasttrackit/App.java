package org.fasttrackit;

/**
 * Hello animalute!
 */
public class App {

    public App() {
        super();
    }
    public static void main(String[] args) {

        Animal animal = new Animal(9, 6, 8);
        animal.setName("Misa");
        animal.setAge(1);
        animal.setWeight(12.6);

        Food food = new Food("Purina",50, 02.02.2022);
        food.setAmount(2);

        Caine caine = new Caine()

        RecreationalActivity recreationalActivity = new RecreationalActivity("running", 10);

        Rescuer rescuer = new Rescuer(600, "garden");

        Vet vet = new Vet("animalBehavior", true);

        Animal animal2 = new Animal(5, 5, 9);
        animal2.setAge(3);
        animal2.setWeight(2.2);

        Food food2 = new Food("Purina", 30, 2022.03.22);
        food2.setAmount(0.5);

        Rescuer rescuer2 = new Rescuer(200,"house");

        Vet vet2 = new Vet("animalBehavior",true);

        System.out.println("animal2 name: " + animal2.getName());
        System.out.println("animal name: " + animal.getName());


        System.out.println(rescuer+ "give some" + food + "to feed" + animal);

        System.out.println(rescuer.getName() + recreationalActivity.getName() + "with" + animal.getName() + ". So" + animal.getName() + "'s mood is"  + animal.getMood());

    }

}
