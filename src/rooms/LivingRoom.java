package rooms;

import helper.Room;
import NPC.Clown;


public class LivingRoom extends Room{


    public LivingRoom(){
        enemies.put("clown", new Clown());
    }

    public void enter(){
        if(enemies.containsKey("clown")){
            System.out.println("It's a nice living room");
            System.out.println("The tv is on... ");
            System.out.println("And whats that...");
            System.out.println("Its a fucking clown!");
        }else{
            System.out.println("NOTHING TO SEE HERE. GO SOUTH!");
        }
    }

    public void describe(){
        System.out.println("You cannot focus on anything but the clown");
    }

}
