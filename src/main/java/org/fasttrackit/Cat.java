package org.fasttrackit;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String positiveMood() {
        if (getMood()> 5);{
            System.out.println(getName()+"is happy. She's purrs");
        }
        return positiveMood();
    }

}
