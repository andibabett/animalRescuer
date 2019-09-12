package org.fasttrackit;

public class RecreationalActivity {


    private boolean sleep;
    private double time;


    public RecreationalActivity(double time, boolean sleep) {
        this.time = time;
        this.sleep = sleep;
    }

    public RecreationalActivity(String foodType) {
    }

    public boolean isSleep() {
        return sleep;
    }

    public void setSleep(boolean sleep) {
        this.sleep = sleep;
    }

    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }
}
