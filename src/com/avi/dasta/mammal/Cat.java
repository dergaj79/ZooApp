/**
 * this class hold cat parameters and return cat object!!!
 */

package com.avi.dasta.mammal;

import com.avi.dasta.basic.Mammals;

public class Cat extends Mammals {
  
    public Cat(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget) {
		super(id, name, color, age, isSick, animalMonthlyBudget);
		this.isPredator = false;
	}

    
	public Cat(boolean isPredator) {
        super(isPredator);
    }

    @Override
    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public void climbATree(){
        System.out.println("the Cat is climb on tree!!!");
    }

    
    
    @Override
	public String toString() {
		return "Cat [isPredator=" + isPredator + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age
				+ ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}
}
