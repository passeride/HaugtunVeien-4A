package helper;

import java.util.HashMap;

public abstract class Room extends TAObject{
    public static final int ROOM_NORTH = 1;
    public static final int ROOM_EAST = 2;
    public static final int ROOM_SOUTH = 3;
    public static final int ROOM_WEST = 4;
    public Room[] Doors = new Room[4];

    public HashMap<String, Enemy> enemies = new HashMap<String, Enemy>();
    
    public HashMap<String, Item> items = new HashMap<String, Item>();
    
    public static HashMap<String, Room> rooms = new HashMap<String, Room>();

    public void enter(){

    }

    public void exit(){

    }

    public void describe(){
        for(Enemy e : enemies.values()){
            ((Describe)e).describe();
            System.out.println("");
        }
    }


}
