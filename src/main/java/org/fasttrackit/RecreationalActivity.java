package org.fasttrackit;

public class RecreationalActivity {

    // parametrii
    private String name;
    private double time;

    // constructor
    public RecreationalActivity(String name, double time) {
        this.name = name;
        this.time = time;
    }
    // metoda
    public static void recreationalActivity(Rescuer rescuer, String name, Animal animal) {
        System.out.println(rescuer.getName() + name + "with" + animal.getName() + ". So" + animal.getName() + "'s mood is"  + animal.getMood());
    }

    // get-set
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getTime() {
        return time;
    }
    public void setTime(double time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "RecreationalActivity{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}


