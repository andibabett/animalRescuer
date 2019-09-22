package org.fasttrackit;

public class RecreationalActivity {


    String name;
    double time;

    public RecreationalActivity(String name, double time) {
    }


    public RecreationalActivity() {
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

    public void RecreationalActivity(String name, double time) {
        RecreationalActivity recreationalActivity = new RecreationalActivity("playWithBall", 5);


        System.out.println(name + "is good for" + Animal.class);
    }

    @Override
    public String toString() {
        return "RecreationalActivity{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}


