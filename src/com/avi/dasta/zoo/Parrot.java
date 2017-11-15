package com.avi.dasta.zoo;

public class Parrot extends Birds {
protected boolean fly =true;

    public Parrot(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget, boolean fly, boolean fly1) {
        super(id, name, color, age, isSick, animalMonthlyBudget, fly);
        this.fly = fly;
    }

    @Override
    public boolean isFly() {
        return fly;
    }

    @Override
	public String toString() {
		return "Parrot [fly=" + fly + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age
				+ ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}

	@Override
    public void setFly(boolean fly) {
        this.fly = fly;
    }
}
