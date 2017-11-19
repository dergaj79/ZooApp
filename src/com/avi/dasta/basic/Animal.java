package com.avi.dasta.basic;

import java.util.ArrayList;

/**
 * this class presents the animal class for zoo app.
 */
public class Animal {

    //members for Animal class

    protected String id;
    protected String name;
    protected String color;
    protected double age;
    protected boolean isSick;
    protected double animalMonthlyBudget;
    private double sickAnimalPrice = 0.05;

//////////////////////////////////  //Constructors// //////////////////////////////////
    public Animal() {
    }

    public Animal(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.isSick = isSick;
        this.animalMonthlyBudget = animalMonthlyBudget;
    }
//////////////////////////////////   //Constructors// //////////////////////////////////
    
//////////////////////////////////////Getters ////////////////////////////////////// 
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public double getAge() {
        return age;
    }

    public boolean isSick() {
        return isSick;
    }

    public double getAnimalMonthlyBudget() {
        return animalMonthlyBudget;
    }
 
//////////////////////////////////////Getters //////////////////////////////////////
    
////////////////////////////////////// Setters //////////////////////////////////////
    
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public void setMonthlyBudget(double animalMonthlyBudget) {
        this.animalMonthlyBudget = animalMonthlyBudget;
    }
    
    public void setSick(boolean isSick) {
        this.isSick = isSick;
          if (isSick == true){
              animalMonthlyBudget = + (animalMonthlyBudget*sickAnimalPrice);
        }
     }
    
////////////////////////////////////// Setters //////////////////////////////////////
    

//////////////////////////////////////Methods //////////////////////////////////////

    public void eat(String name){
        System.out.println(name + " is eating");
    }
    public void play(String name){
        System.out.println(name + " is playing");
    }


    
    
    @Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", isSick=" + isSick
				+ ", animalMonthlyBudget=" + animalMonthlyBudget + ", sickAnimalPrice=" + sickAnimalPrice + "]";
	}
//////////////////////////////////////Methods //////////////////////////////////////
}
