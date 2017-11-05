/**
 * this class hold dog parameters and return dog object!!!
 */

package com.avi.dasta.zoo;

public class Dog extends Mammals {
protected boolean isPredator = false;

    public Dog(boolean isPredator) {
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

    public void playDead(){
        System.out.println("Dod play Dead!!!");
    }

    @Override
    public String toString() {
        return "Dog{" + "isPredator=" + isPredator + '}';
    }
}
