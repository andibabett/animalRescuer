package org.fasttrackit;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }


    @Override
    public String positiveMood() {
        return "Cat sleep.";
    }
}
