/**
 * this class hold dog parameters and return dog object!!!
 */

package com.avi.dasta.zoo;

public class Dog extends Mammals {
protected boolean isPredator = false;

	/**
 * @param id
 * @param name
 * @param color
 * @param age
 * @param isSick
 * @param animalMonthlyBudget
 * @param isPredator
 */
	public Dog(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget,boolean isPredator) {
		super(id, name, color, age, isSick, animalMonthlyBudget, isPredator);
	}


    @Override
    public boolean isPredator() {
        return isPredator;
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
        return "Dog{" + "isPredator=" + isPredator + '}';
    }
}
