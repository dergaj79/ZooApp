/**
 * this class hold dog parameters and return dog object!!!
 */

package com.avi.dasta.mammal;

import com.avi.dasta.basic.Mammals;

/**
 * @param id
 * @param name
 * @param color
 * @param age
 * @param isSick
 * @param animalMonthlyBudget
 * @param isPredator
 */
public class Dog extends Mammals {
	
public Dog(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget) {
	super(id, name, color, age, isSick, animalMonthlyBudget);
	this.isPredator = false;
}

    @Override
    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public void playDead(){
        System.out.println("Dod play Dead!!!");
    }

	@Override
	public String toString() {
		return "Dog [isPredator=" + isPredator + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age
				+ ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}
}
