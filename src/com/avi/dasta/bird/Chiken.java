package com.avi.dasta.bird;

import com.avi.dasta.basic.Birds;

public class Chiken extends Birds {

    public Chiken(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget, boolean fly, boolean fly1) {
        super(id, name, color, age, isSick, animalMonthlyBudget, fly);
        this.fly = false;
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
		return "Chiken [fly=" + fly + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age
				+ ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}

   
}
