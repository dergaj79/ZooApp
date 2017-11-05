package com.avi.dasta.zoo;

import javax.sound.midi.Soundbank;

public class Runner {
    public static void main(String[] args) throws Exception {
       Parrot parrot = new Parrot("01","oki","Blue",40,true,80.9,true,true);
        System.out.println(parrot.isSick());
        System.out.println(parrot.toString());

        Zoo z1 = new Zoo(4,80);
        z1.addAnimalToZoo(parrot);
        z1.addAnimalToZoo(new Ostrich("12","FF","black",45,false,900,false,true));
        System.out.println(z1);

    }
}
