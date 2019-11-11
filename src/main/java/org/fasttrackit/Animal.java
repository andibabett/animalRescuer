package org.fasttrackit;

class Animal {

    private String name;
    private int health;
    private int hunger;
    private double age;
    private int mood;
    private double weight;
    private String favoriteFood;
    private String favoriteRecreationalActivity;
    private String type;

    //constructor
    public Animal(int health, int hunger) {
        this.health = health;
        this.hunger = hunger;
    }

    public String positiveMood() {
        return (getName() + "is happy!");
    }

    // get-set
    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public int getMood() {
        return mood;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationalActivity() {
        return favoriteRecreationalActivity;
    }

    public void setFavoriteRecreationalActivity(String scrape) {
        this.favoriteRecreationalActivity = favoriteRecreationalActivity;
    }

    public void setMood(int mood) {
        this.mood = mood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", hunger=" + hunger +
                ", age=" + age +
                ", mood=" + mood +
                ", weight=" + weight +
                ", favoriteFood='" + favoriteFood + '\'' +
                ", favoriteRecreationalActivity='" + favoriteRecreationalActivity + '\'' +
                '}';
    }


}
