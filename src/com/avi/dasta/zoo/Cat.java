/**
 * this class hold cat parameters and return cat object!!!
 */

package com.avi.dasta.zoo;

public class Cat extends Mammals {
    protected boolean isPredator = false;

    public Cat(boolean isPredator) {
        super(isPredator);
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
