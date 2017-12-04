
package NPC;

import helper.Enemy;

import com.passeride.textAdventure.Game;

public class Clown extends Enemy{

    public void describe(){
        if(health >= 1){
            System.out.println("He looks...");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Like a clown");
        }else{
            System.out.println("It's dead");
            System.out.println("It won't hurt anyone anymore");
            System.out.println("Let's never talk about this");
            Game.g.currentRoom.enemies.clear();
        }
    }

    public void pet(){
        numberOfPets++;
        if(numberOfPets == 1){
            System.out.println("NO! THATS NOT AN OPTION!");
        }else if(numberOfPets >= 2){
            System.out.println("You know this will not happend");
        }
    }
}
