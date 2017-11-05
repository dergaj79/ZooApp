/**
 * this class hold horse parameters and return horse object!!!
 */
package com.avi.dasta.zoo;

public class Horse extends Mammals {
    protected boolean isPredator =false;


    public Horse(boolean isPredator) {
        super(isPredator);
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
