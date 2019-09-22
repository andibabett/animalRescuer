package org.fasttrackit;

/**
 * Hello animalute!
 */
public class App {

    private static Object Animal;
    private static Object Rescuer;

    public App() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "App{}";
    }

    public static void main(String[] args) {
        Animal animal = new Animal(2);
        animal.setName("Misa");
        animal.setAge(1);
        animal.setHealth(9);
        animal.setHunger(5);
        animal.setWeight(12.6);

        Food food = new Food("Purina");
        food.setPrice(10);
        food.setAmount(2);
        food.localDate();

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.name = "run";


        Rescuer rescuer = new Rescuer(28, "Andi");
        rescuer.setAvaibleMoney(50);
        rescuer.setSex("female");

        Vet vet = new Vet(50, true);
        vet.setName("Doctor");
        vet.setSpecialization("animalBehavior");
        vet.setSex("male");


        System.out.println("Hello Animalute!");
        System.out.println(vet.getName());
        System.out.println(vet.getAge());
        System.out.println(vet.getSpecialization());
        System.out.println(food.getFoodType());
        System.out.println(food.getPrice());


        System.out.println(animal);

        Animal animal2 = new Animal(7);
        animal2.setName("Pisica");
        animal2.setAge(3);
        animal2.setHealth(5);
        animal2.setHunger(3);
        animal2.setWeight(2.2);

        Food food2 = new Food("Purina");
        food2.setPrice(7);
        food2.setAmount(0.5);

        Rescuer rescuer2 = new Rescuer(34, "Marian");
        rescuer2.setAvaibleMoney(500);
        rescuer2.setAge(34);
        rescuer2.setSex("male");


        Vet vet2 = new Vet(50, true);
        vet2.setName("Medic");
        vet2.setName("Doctor");
        vet2.setSpecialization("animalBehavior");
        vet2.setSex("male");


        System.out.println(rescuer2.getSex());
        System.out.println(animal2.getAge());
        System.out.println(rescuer2.getAvaibleMoney());
        System.out.println(animal2.getHealth());
        System.out.println(rescuer2.getName());
        System.out.println(vet2.getName());
        System.out.println(vet2.isExperience());
        System.out.println(vet2.getSpecialization());
        System.out.println(food2.getFoodType());
        System.out.println(food2.getPrice());


        System.out.println("animal2 name: " + animal2.getName());
        System.out.println("animal name: " + animal.getName());
        System.out.println("vet2 name: " + vet2.getName());
        System.out.println("vet1 name: " + vet.getName());
        System.out.println("rescuer2 name: " + rescuer2.getName());

        System.out.println(Rescuer + "give some" + food + "to feed" + animal);

    }
}
