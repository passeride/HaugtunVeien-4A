package com.passeride.textAdventure;

import helper.Describe;
import helper.Useable;

public class Shoe implements Useable, Describe{
    public void use(){
        System.out.println("Your walkin is 2.5% more comfotable, and you are imune to hookworm");
    }

    public void describe(){
        System.out.println("This is a shoe, it might have a friend nearby");
    }
}
