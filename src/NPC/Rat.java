package NPC;

import helper.Enemy;

public class Rat extends Enemy{


    public void describe(){
        if(!isCompanion){
            if(health <= 0){
                System.out.println("");
                System.out.println("It's now dead, the small rat family in the walls cry out!");
            }else{
                System.out.println("This is a rat");
                super.describe();
                System.out.println("This rat is cute");
            }
        }else{
            System.out.println(name + " looks like a healthy rat");
            System.out.println("he enjoys his new home in your breast pocket");
        }
    }


    public void pet(){
        numberOfPets ++;
        if(!isCompanion){
            if(numberOfPets >= 1){
                becomeCompanion();
            }else{
                System.out.println("This is one pat-loving-rat");
                System.out.println("Rat-lovi'n increased by 10");
            }
        }else{
            System.out.println(name + " likes this pat, this is a nice pat");
        }
    }


}
