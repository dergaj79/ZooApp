package com.avi.dasta.zoo;

public class Chiken extends Birds {
    protected boolean fly =false;

    public Chiken(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget, boolean fly, boolean fly1) {
        super(id, name, color, age, isSick, animalMonthlyBudget, fly);
        this.fly = fly;
    }

    @Override
    public boolean isFly() {
        return fly;
    }

    @Override
    public void setFly(boolean fly) {
        this.fly = fly;
    }

    @Override
    public String toString() {
        return "Chiken{" + "fly=" + fly + '}';
    }
}
