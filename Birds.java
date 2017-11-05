package com.avi.dasta.zoo;

import com.avi.dasta.zoo.Animal;

public class Birds extends Animal {

    //Members
    protected boolean fly;


    //Getter and Setters
    public boolean isFly() {
        return fly;
    }
    public void setFly(boolean fly) throws Exception {
        this.fly = fly;
    }

    //Constructors

    public Birds(String id, String name, String color, double age, boolean isSick, double animalMonthlyBudget, boolean fly) {
        super(id, name, color, age, isSick, animalMonthlyBudget);
        this.fly = fly;
    }

    //Methods
    public void fly(){
        if (fly == true){
            System.out.println(name + " Bird is flying");
        }
        else{
            System.out.println("bird can't fly");
        }
    }

    @Override
    public String toString() {
        return "Birds{" +
                "fly=" + fly +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isSick=" + isSick +
                ", animalMonthlyBudget=" + animalMonthlyBudget +
                '}';
    }
}