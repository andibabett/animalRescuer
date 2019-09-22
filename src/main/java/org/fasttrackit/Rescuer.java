package org.fasttrackit;

public class Rescuer extends Person {




    private Object Rescuer;

    public Rescuer(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public static void main(String[] args) {

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


    public String feed(String foodType) {
        return feed("Purina");
    }

    public int feed(String name, String getFoodType) {



        System.out.println(name + "gave some" + getFoodType + "to feed" + Animal.class);


        int feed;


        int getMood = 3;
        getMood = 2 * getMood;

        feed = getMood* 2;
        System.out.println(getName() + "mood is" + getMood);

        return feed;

    }

    private String setName() {
        return null;
    }

    @Override
    public String toString() {
        return "Rescuer{" +
                "Rescuer=" + Rescuer +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", avaibleMoney=" + avaibleMoney +
                ", place='" + place + '\'' +
                '}';
    }
}





