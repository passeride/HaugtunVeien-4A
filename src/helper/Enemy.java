package helper;
import java.util.Scanner;

import com.passeride.textAdventure.Game;

public abstract class Enemy implements Describe, Hittable{


    public int health = 10;
    public int defense = 10;
    public int numberOfPets = 0;
    public String name ="";
    public boolean isCompanion = false;

    public void becomeCompanion(){
        System.out.println("** You have a new companion** " );
        System.out.println("Write the name of your new companion");
        Scanner s = new Scanner(System.in);
        name = capializeFirstLetter(s.nextLine());
        isCompanion = true;
        Game.g.companion = this;
        Game.g.currentRoom.enemies.values().remove(this);
        // Closing Scanner
        s.close();
    }

    public String capializeFirstLetter(String input){
        return input.substring(0, 1).toUpperCase() + input.substring(1);
    }

    public void hit(){

    }

    public void pet(){
        
    }

    public void describe(){
        System.out.println("");
        System.out.println("Health " + health);
        System.out.println("Defense" + defense);
        System.out.println("");
    }

}
