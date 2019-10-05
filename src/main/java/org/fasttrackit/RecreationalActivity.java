package org.fasttrackit;

public class RecreationalActivity {

    // parametrii
    private String name;
    private int moodIncrease;

    // constructor
    public RecreationalActivity(String name, int moodIncrease) {
        this.name = name;
        this.moodIncrease = moodIncrease;
    }
    // get-set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoodIncrease() {
        return moodIncrease;
    }

    public void setTime(int moodIncrease) {
        this.moodIncrease = moodIncrease;
    }


}


