/**
 * this class hold Mammals parameters and return Mammals object
 */

package com.avi.dasta.zoo;

import com.avi.dasta.zoo.Animal;

public class Mammals extends Animal {
    protected boolean isPredator;

    public Mammals(boolean isPredator) {
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
