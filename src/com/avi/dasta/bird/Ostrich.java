package com.avi.dasta.bird;

import com.avi.dasta.basic.Birds;

public class Ostrich extends Birds {
    

    public Ostrich(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget, boolean fly) {
        super(id, name, color, age, isSick, animalMonthlyBudget, fly);
        this.fly = false;
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
		return "Ostrich [fly=" + fly + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age
				+ ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}
	

}
