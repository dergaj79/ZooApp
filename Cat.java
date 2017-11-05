/**
 * this class hold cat parameters and return cat object!!!
 */

package com.avi.dasta.zoo;

public class Cat extends Mammals {
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
	public Cat(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget,boolean isPredator) {
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

    public void climbATree(){
        System.out.println("the Cat is climb on tree!!!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isPredator=" + isPredator +
                '}';
    }
}
