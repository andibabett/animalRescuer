package org.fasttrackit;

/**
 * Hello animalute!
 *
 */
public class App 
{

    public static void main(String[] args )
    {
        Animal animal = new Animal();
        animal.name = "Caine";
        animal.age = 1;
        animal.health = 9;
        animal.hunger = 5;
        animal.mood = 5;
        animal.favoriteFood = "Meal";
        animal.recreationalActivity = "eat";
        animal.weight = 12.6;


        Food food = new Food();
        food.foodType = "Meal";
        food.price = 10;
        food.amount = 2;


        Rescuer rescuer = new Rescuer();
        rescuer.name = "Mr";
        rescuer.avaibleMoney = 50;
        rescuer.sex = "male";
        rescuer.age = 5;


        Vet vet = new Vet();
        vet.name = "Doctor";
        vet.age = 25;
        vet.experience = "false";
        vet.specialization = "animalBehavior";
        vet.sex = "Male";

        RecreationalActivity recreationalActivity = new RecreationalActivity();
        recreationalActivity.sleep = "yes";
       recreationalActivity.time = 5;

       Game game =  new Game();
       game.Dog = "running";
       game.Rescuer = "hugs";
       game.Vet = "teaching";


       System.out.println( "Hello Animalute!" );
        System.out.println(animal.name);
        System.out.println(animal.favoriteFood);
        System.out.println(vet.name);
        System.out.println(vet.experience);
        System.out.println(vet.specialization);
        System.out.println(food.foodType);
        System.out.println(food.price);










        Animal animal2 = new Animal();
        animal2.name = "Pisica";
        animal2.age = 2;
        animal2.health = 6;
        animal2.hunger = 2;
        animal2.mood = 8;
        animal2.favoriteFood = "Milk";
        animal2.recreationalActivity = "sleep";
        animal2.weight = 2.2;

        Food food2 = new Food();
        food2.foodType = "Milk";
        food2.amount = 0.5;
        food2.price = 15.33;

        Rescuer rescuer2 = new Rescuer();
        rescuer2.name = "Mr";
        rescuer2.avaibleMoney = 50;
        rescuer2.sex = "male";
        rescuer2.age = 5;

        Vet vet2 = new Vet();
        vet2.name = "Medic";
        vet2.age = 50;
        vet2.experience = "true";
        vet2.specialization = "animalWelfare";

        RecreationalActivity recreationalActivity2 = new RecreationalActivity();
        recreationalActivity2.sleep = "no";
        recreationalActivity2.time = 0;






        System.out.println(rescuer2.sex);
        System.out.println(animal2.age);
        System.out.println(animal2.favoriteFood);
        System.out.println(rescuer2.avaibleMoney);
        System.out.println(animal2.health);
        System.out.println(rescuer2.name);
        System.out.println(vet2.name);
        System.out.println(vet2.experience);
        System.out.println(vet2.specialization);
        System.out.println(food2.foodType);
        System.out.println(food2.price);



        System.out.println("animal2 name: " + animal2.name);
        System.out.println("animal name: " + animal.name);
        System.out.println("vet2 name: " + vet2.name);
        System.out.println("vet1 name: " + vet.name);
        System.out.println("adopter2 name: " + rescuer2.name);




    }
}
