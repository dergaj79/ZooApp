package com.avi.dasta.zoo;

public class Ostrich extends Birds {
    protected boolean fly =false;

    public Ostrich(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget, boolean fly, boolean fly1) {
        super(id, name, color, age, isSick, animalMonthlyBudget, fly);
        this.fly = fly;
    }

    @Override
    public boolean isFly() {
        return false;
    }

    @Override
    public void setFly(boolean fly) throws Exception {
        if (fly == true) {
            throw  new Exception("this Bird can't fly!!");
        }
        else {
            System.out.println(" bird can't fly!!");
        }
    }

    @Override
    public String toString() {
        return "Ostrich{" + "fly=" + fly + '}';
    }
}
