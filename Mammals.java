/**
 * this class hold Mammals parameters and return Mammals object
 */

package com.avi.dasta.zoo;

import com.avi.dasta.zoo.Animal;

public class Mammals extends Animal {
    protected boolean isPredator;

    /**
	 * @param id
	 * @param name
	 * @param color
	 * @param age
	 * @param isSick
	 * @param animalMonthlyBudget
	 * @param isPredator
	 */
	public Mammals(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget,boolean isPredator) {
		super(id, name, color, age, isSick, animalMonthlyBudget);
		this.isPredator = isPredator;
	}

    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public String toString() {
        return "Mammals{" + "isPredator=" + isPredator + '}';
    }
}
