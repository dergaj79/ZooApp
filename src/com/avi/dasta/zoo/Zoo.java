package com.avi.dasta.zoo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zoo{

	//Members
	protected int zooCapacity;

    protected double zooBudget;
    protected double currentZooBudget;
    
    List<Animal> animals;

    //Contractors

    public Zoo(int zooCapacity, double zooBudget) {
        this.zooCapacity = zooCapacity;
        this.zooBudget = zooBudget;
        animals = new ArrayList<Animal>();
    }

    public Zoo(int zooCapacity, double zooBudget, List<Animal> animals) {
        this.zooCapacity = zooCapacity;
        this.zooBudget = zooBudget;
        animals = new ArrayList<Animal>();
        
        for (Animal animal : animals) {
			
        	addAnimal(animal);
		} 
    }

	public void addAnimal(Animal animal) {
		
		if (animals.size() == zooCapacity) {
			throw new RuntimeException("Zoo is full loeded please try letar on !!!");
		}

		double animalMonthlyBudget = animal.getAnimalMonthlyBudget();
		if (zooBudget >= (animalMonthlyBudget + currentZooBudget)) {
			animals.add(animal);
			currentZooBudget = + animalMonthlyBudget;
		} 
		else {
			throw new RuntimeException("You can't add new animal to the zoo, no budget!!!");
		}
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
        return animals.size();
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    //getters and setters//

    public void removeAnimal(){

    }
    public void printAmimalSortedByAge(Animal[] animals){

        return;
    }
    public List <Animal> printAnimalSortedByBudget (List<Animal> animals){
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

    public List <Animal> printAnimalSortedByName (List<Animal> animals){
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

    public List <Animal> printAnimalSortByBudget (List<Animal> animals){
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
		return "Zoo [zooCapacity=" + zooCapacity + ", zooBudget=" + zooBudget + ", currentZooBudget=" + currentZooBudget
				+ ", animals=" + animals + "]";
	}
   
}



