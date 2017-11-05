package com.avi.dasta.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections.*;
import java.util.List;

public class Zoo implements Comparable{
    //Members
    protected int  zooCapacity = 100;
    protected double zooBudget;
    protected int currentNumberOfAnimals = 0;
    protected int currentZooBudget = 0;
    List<Animal> animals;

    //Contractors

    public Zoo(int zooCapacity, double zooBudget) {
        this.zooCapacity = zooCapacity;
        this.zooBudget = zooBudget;
        this.currentNumberOfAnimals = currentNumberOfAnimals;
        animals = new ArrayList<Animal>();
    }

    public Zoo(int zooCapacity, double zooBudget, int currentNumberOfAnimals, List<Animal> animals) {
        this.zooCapacity = zooCapacity;
        this.zooBudget = zooBudget;
        this.currentNumberOfAnimals = currentNumberOfAnimals;
        this.animals = animals;
    }


    //getters and setters

    public int getZooCapacity() {
        return zooCapacity;
    }

    public void setZooCapacity(int zooCapacity) {
        this.zooCapacity = zooCapacity;
    }

    public double getZooBudget() {
        return zooBudget;
    }

    public void setZooBudget(double zooBudget) {
        this.zooBudget = zooBudget;
    }

    public int getCurrentNumberOfAnimals() {
        return currentNumberOfAnimals;
    }

    public void setCurrentNumberOfAnimals(int currentNumberOfAnimals) {
        this.currentNumberOfAnimals = currentNumberOfAnimals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    //getters and setters//

   //methods//
    public void addAnimalToZoo(Animal a) throws Exception{
        if (currentNumberOfAnimals >= zooCapacity){
            throw new Exception("No more Capcity in Zoo, Check later ON !");
        }
        if (currentZooBudget>=zooBudget){
            throw new Exception ("NO Budget to adding more Animal to Zoo, Check later ON !");
        }
        animals.add(a);
        currentNumberOfAnimals++;

    }

    public void removeAnimal(){

    }
    public void printAmimalSortedByAge(Animal[] animals){

        return;
    }
    public List <Animal> printAmimalSortedByBudget (List<Animal> animals){
    int numberOfAnimals = animals.size();
        System.out.println(numberOfAnimals);
        for (int i=0; i< numberOfAnimals; i++){
            for (int j=0;j<(numberOfAnimals-i); j++){
                if (animals.get(j-1).getAge()> animals.get(j).getAge()){
                    Collections.swap(animals, j-1,j);
                }
            }
        }
        return animals;
    }

    public List <Animal> printAmimalSortedByName (List<Animal> animals){
        int numberOfAnimals = animals.size();
        System.out.println(numberOfAnimals);
        for (int i=0; i< numberOfAnimals; i++){
            for (int j=0;j<(numberOfAnimals-i); j++){
                if (animals.get(j-1).getName().compareTo(animals.get(j).getName()) > 0){
                    Collections.swap(animals, j-1,j);
                }
            }
        }
        return animals;
    }

    public List <Animal> printAmimalSortByBudget (List<Animal> animals){
        int numberOfAnimals = animals.size();
        System.out.println(numberOfAnimals);
        for (int i=0; i< numberOfAnimals; i++){
            for (int j=0;j<(numberOfAnimals-i); j++){
                if (animals.get(j-1).getAnimalMonthlyBudget() > animals.get(j).getAnimalMonthlyBudget() ){
                    Collections.swap(animals, j-1,j);
                }
            }
        }
        return animals;
    }

    @Override
    public String toString() {
        return "Zoo [" +
                "zooCapacity=" + zooCapacity +
                ", zooBudget=" + zooBudget +
                ", currentNumberOfAnimals=" + currentNumberOfAnimals +
                ", currentZooBudget=" + currentZooBudget +
                ", animals=" + animals + "]";
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}



