/**
 * this class hold Mammals parameters and return Mammals object
 */

package com.avi.dasta.basic;

import com.avi.dasta.basic.Animal;

public class Mammals extends Animal {
    protected boolean isPredator;

 

	/**
	 * @param id
	 * @param name
	 * @param color
	 * @param age
	 * @param isSick
	 * @param animalMonthlyBudget
	 */
	public Mammals(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget) {
		super(id, name, color, age, isSick, animalMonthlyBudget);
	}



	public Mammals(boolean isPredator) {
        this.isPredator = isPredator;
    }

 

    public void setPredator(boolean predator) {
        isPredator = predator;
    }



	@Override
	public String toString() {
		return "Mammals [isPredator=" + isPredator + ", id=" + id + ", name=" + name + ", color=" + color + ", age="
				+ age + ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}

 
}
