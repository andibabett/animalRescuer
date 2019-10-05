package org.fasttrackit;

import java.time.LocalDate;

/**
 * Hello animalute!
 */
public class App {

    public static void main(String[] args) {

        Animal animal = new Animal(9, 6);
        animal.setName("Misa");
        animal.setAge(1);
        animal.setWeight(12.6);

        Food food = new Food("Purina", 50);
        food.setAmount(2);
        food.setExpiryDate(LocalDate.of(2020, 12, 5));

        RecreationalActivity recreationalActivity = new RecreationalActivity("fawn", 10);

        Rescuer rescuer = new Rescuer("Andi", 28, 520);


        Animal animal2 = new Animal(5, 5);
        animal2.setAge(3);
        animal2.setWeight(2.2);
        animal.setFavoriteRecreationalActivity("Scrape");
        animal.setFavoriteFood("Purina");

        Caine caine = new Caine("Catelus");

        Cat cat = new Cat("Pisi");

        Food food2 = new Food("Purina", 30);
        food2.setAmount(0.5);
        food.setExpiryDate(LocalDate.of(2022, 03, 25));

        Rescuer rescuer2 = new Rescuer("Marian", 34, 960);

        System.out.println(rescuer + "give some" + food + "to feed" + animal);

        System.out.println(rescuer.getName() + recreationalActivity.getName() + "with" + animal.getName() + ". So" + animal.getName() + "'s mood is" + animal.getMood());

        System.out.println(rescuer.getName() + "mood is" + animal.getMood() + "when" + rescuer.getName() + recreationalActivity.getName() + "with him");

        rescuer.feed(animal, food);
        rescuer.activity(animal, recreationalActivity);

        System.out.println(animal.positiveMood());
        System.out.println(caine.positiveMood());
        System.out.println(cat.positiveMood());

        System.out.println(animal.getName() + "'s hunger level is" + animal.getHunger());
        rescuer.feed(animal, food);
        System.out.println("After" + animal.getName() + "ate, her hunger level was : " + animal.getHunger());

        System.out.println(animal.getName() + "have" + recreationalActivity.getName() + "with" + rescuer.getName()+ ", and"
                        + animal.getName() + "'s mood is: " + animal.getMood());
        rescuer.activity(animal, recreationalActivity);
        System.out.println("After" + recreationalActivity.getName() + "," + animal.getName()+"' mood was: "+ animal.getMood() );

    }

}
