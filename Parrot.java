package com.avi.dasta.zoo;

public class Parrot extends Birds {
protected boolean fly =true;



/**
 * @param id
 * @param name
 * @param color
 * @param age
 * @param isSick
 * @param animalMonthlyBudget
 * @param fly
 */
public Parrot(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget,boolean fly) 
{
	super(id, name, color, age, isSick, animalMonthlyBudget, fly);
}


    @Override
    public boolean isFly() {
        return fly;
    }

    @Override
    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
