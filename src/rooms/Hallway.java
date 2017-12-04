package rooms;

import helper.Room;
import NPC.Rat;


public class Hallway extends Room{

    public Hallway(){
        enemies.put("rat", new Rat());
        Doors[Room.ROOM_NORTH] = new LivingRoom();
        Doors[Room.ROOM_NORTH].Doors[Room.ROOM_SOUTH] = this;
    }

    public void describe(){
        //super.describe();
        System.out.println("It's a damp entrance hallway");
        System.out.println("To the north there is an open door");
        System.out.println("You feel the prencence of a rat nearby");
    }

}
