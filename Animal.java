package com.avi.dasta.zoo;

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

    //Getters and Setters for the members//
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public boolean isSick() {
        return isSick;
    }

    public void setSick(boolean isSick) {
       this.isSick = isSick;

         if (isSick == true){
             animalMonthlyBudget =+ (animalMonthlyBudget*sickAnimalPrice); //animal budget incearse by 5% in case the animal si sick.
       }
    }

    public double getAnimalMonthlyBudget() {
        return animalMonthlyBudget;
    }

    public void setMonthlyBudget(double animalMonthlyBudget) {
        this.animalMonthlyBudget = animalMonthlyBudget;
    }
    //Constructors//

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

    //Methods//
    public void eat(String name){
        System.out.println(name + " is eating");
    }
    public void play(String name){
        System.out.println(name + " is playing");
    }


    public void printAnimalBudget(){
        //TODO;
    }

    @Override
    public String toString() {
        return "Animal{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", color='" + color + '\'' +
                ", age=" + age +
                ", isSick=" + isSick +
                ", animalMonthlyBudget=" + animalMonthlyBudget + '}';
    }

}
