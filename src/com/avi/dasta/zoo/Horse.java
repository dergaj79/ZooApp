/**
 * this class hold horse parameters and return horse object!!!
 */
package com.avi.dasta.zoo;

public class Horse extends Mammals {
    protected boolean isPredator =false;

    
    public Horse(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget,
			boolean isPredator) {
		super(id, name, color, age, isSick, animalMonthlyBudget);
		this.isPredator = isPredator;
	}


	public Horse(boolean isPredator) {
        super(isPredator);
    }


    @Override
    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public void ride(){
        System.out.println("the Horse can ride!!!");
    }


	@Override
	public String toString() {
		return "Horse [isPredator=" + isPredator + ", id=" + id + ", name=" + name + ", color=" + color + ", age=" + age
				+ ", isSick=" + isSick + ", animalMonthlyBudget=" + animalMonthlyBudget + "]";
	}

}
