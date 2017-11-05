package com.avi.dasta.zoo;


public class Runner {
    public static void main(String[] args) throws Exception {
       Parrot p1 = new Parrot("01", "Toki1", "Blue", 40, true, 80.9, true);
       Parrot p2 = new Parrot("02", "Toki2", "Black", 3.4, false, 10, true);
       Horse h1 = new Horse("03", "Horsy", "White", 1.0, false, 30.4, false);
       Dog d1 = new Dog("5", "liky", "Red", 6.5, true, 40, true);
       
       	System.out.println(p1.isSick());
        System.out.println(p1.toString());
        
        System.out.println("***********************************************");
        
        System.out.println(p2.isSick());
        System.out.println(p2.toString());
        
        System.out.println("***********************************************");
        Zoo z1 = new Zoo(4,80);
        z1.addAnimalToZoo(p1);
        z1.addAnimalToZoo(new Ostrich("12","FF","black",45,false,900,false,true));
        System.out.println(z1);
       
        System.out.println("***********************************************");
       
       
        System.out.println("this horse : " + h1);
        
        System.out.println(z1.currentZooBudget);
        
        System.out.println("***********************************************");
        z1.addAnimalToZoo(p2);
        z1.addAnimalToZoo(h1);
        z1.addAnimalToZoo(d1);
        System.out.println(z1);
        
        System.out.println("***********************************************");
        System.out.println(z1.currentZooBudget);
        
        
        
        Zoo z2 = new Zoo(1,30);
        z2.addAnimalToZoo(h1);
        
        System.out.println("***********************************************");

    }
}
