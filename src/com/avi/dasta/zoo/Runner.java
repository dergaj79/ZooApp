package com.avi.dasta.zoo;

import java.util.ArrayList;

import com.avi.dasta.basic.Animal;
import com.avi.dasta.bird.Ostrich;
import com.avi.dasta.bird.Parrot;
import com.avi.dasta.mammal.Cat;
import com.avi.dasta.mammal.Dog;
import com.avi.dasta.mammal.Horse;

public class Runner {
    public static void main(String[] args) throws Exception {
    	 Zoo z1 = new Zoo(6,1000);
    	 		Parrot parrot = new Parrot("01","oki","Blue",40,true,2,true);
    	 				z1.addAnimal(parrot);
    	 				System.out.println("Parrot info: " + parrot);
    	 				System.out.println("*****************************************************");
    	 		Ostrich ostrich =  	new Ostrich("02","FF","black",50,false,2,false);
    	 				z1.addAnimal(ostrich);
    	 				System.out.println("Ostrich info: " + ostrich );
    	 				System.out.println("*****************************************************");
    	 		Dog dog = new Dog("03", "blacky", "black", 1.5, true, 2);
    	 				z1.addAnimal(dog);
    	 				System.out.println("Dog info: " + dog );
    	 				System.out.println("*****************************************************");
    	
    	 		Cat cat = new Cat("04", "caty", "red", 1.5, true, 2);
    	 				z1.addAnimal(cat);
    	 				
    	 				System.out.println("Cat info: " + cat );
    	 				System.out.println("*****************************************************");
    	 				
    	 		Horse horse = new Horse("05", "caty", "red", 5.5, true, 2);
    	 				z1.addAnimal(horse);
    	 				
    	 				System.out.println("Horse info: " + horse );
    	 				System.out.println("*****************************************************");

//    	 				z1.addAnimal(horse);
    	 		
    	 		
//    	 				z1.printMeNicly(ArrayList<Animal> Animals`);
    	 				System.out.println("Zoo info: " + z1.toString());

    }
}
