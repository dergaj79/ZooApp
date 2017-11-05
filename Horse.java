/**
 * this class hold horse parameters and return horse object!!!
 */
package com.avi.dasta.zoo;

public class Horse extends Mammals {
    protected boolean isPredator =false;

    /**
	 * @param id
	 * @param name
	 * @param color
	 * @param age
	 * @param isSick
	 * @param animalMonthlyBudget
	 * @param isPredator
	 */
	public Horse(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget,boolean isPredator) {
		super(id, name, color, age, isSick, animalMonthlyBudget, isPredator);
	}

	@Override
    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    @Override
    public boolean isPredator() {
        return isPredator;
    }

    public void ride(){
        System.out.println("the Horse can ride!!!");
    }
    @Override
    public String toString() {
        return "Horse{" + "isPredator=" + isPredator + '}';
    }
    
}
