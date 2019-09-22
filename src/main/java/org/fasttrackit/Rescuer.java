package org.fasttrackit;

public class Rescuer extends Person {


    public Rescuer(int age, String name) {
        this.age = age;
        this.name = name;
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

    public double getAvaibleMoney() {
        return avaibleMoney;
    }

    public void setAvaibleMoney(double avaibleMoney) {
        this.avaibleMoney = avaibleMoney;
    }

    public String getPlace() {
        return place;
    }


    public String feed(String name, String foodType) {

        System.out.println(getName() + "gave some" + foodType + "to feed" + getName());


        String feed;
        feed = getName() + foodType;



        System.out.println(getName() + "mood is" + mood);

return feed;

    }
    }




