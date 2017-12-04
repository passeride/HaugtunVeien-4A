package com.passeride.textAdventure;
import helper.Describe;
import helper.Enemy;
import helper.Room;
import helper.Useable;
import helper.Weapon;
import items.Bat;

import java.util.Scanner;
import java.util.HashMap;

import rooms.FrontOfMansion;
import rooms.Hallway;


public class Game{

    public HashMap<String, Useable> useables = new HashMap<String, Useable>();
    public HashMap<String, Describe> items = new HashMap<String, Describe>();

    public Room currentRoom;

    public Enemy companion;

    public Weapon currentWeapon;

    public static Game g;

    public Character player;

    public static void main(String[] args){
        @SuppressWarnings("unused")
		Game g = new Game();
    }

    Scanner s;

    public static String lastInput = "";

    public Game(){
        Game.g = this;
        // Creating character
        //player = new Character();
        //player.setUpCharacter();
        // creating room
        currentRoom = new FrontOfMansion();
        currentRoom.enter();

        s = new  Scanner(System.in);

        Bat b = new Bat();
        useables.put("bat",(Useable) b);
        items.put("bat", (Describe) b);

        Shoe s = new Shoe();
        useables.put("shoe",  (Useable) s);
        items.put("shoe", (Describe) s);

        loop();

    }

    public void loop(){
        while(!lastInput.equals("exit")){
            String in = s.nextLine();

            p();
            in = in.toLowerCase();
            lastInput = in;
            switch(in.split(" ")[0]){
            case "go":
                go(in);
                break;
            case "help":
                printHelp();
                break;
            case "use":
                use(in);
                break;
            case "look":
                look(in);
                break;
            case "hit":
                hit(in);
                break;
            case "exit":
                a("see you later");
                break;
            case "pet":
                pet(in);
                break;
            default:
                a("unknown command");
            }
        }
    }

    public void pet(String in){
        String[] words = in.split(" ");

        if(words.length >= 2){
            if(currentRoom.enemies.containsKey(words[1])){
                Enemy e = currentRoom.enemies.get(words[1]);
                e.pet();
            }
        }
    }

    public void go(String in){
        String[] words = in.split(" ");

        if(words.length >= 2){
            int direction = 0;
            switch(words[1]){
            case "north":
                direction = Room.ROOM_NORTH;
                break;
            case "east":
                direction = Room.ROOM_EAST;
                break;
            case "south":
                direction = Room.ROOM_SOUTH;
                break;
            case "west":
                direction = Room.ROOM_WEST;
                break;
            }
            if(currentRoom.Doors[direction] != null){
                currentRoom.exit();
                currentRoom = currentRoom.Doors[direction];
                currentRoom.enter();
            }else{
                a("There is no door here");
            }
        }
    }

    public void hit(String in){
        String[] words = in.split(" ");

        if(words.length >= 2){
            if(currentRoom.enemies.containsKey(words[1])){
                Enemy e = currentRoom.enemies.get(words[1]);
                if(currentWeapon == null){
                    a("you dont have a weapon");
                }else{
                    e.health -= currentWeapon.dmg;
                    a("You strike " + words[1]);
                    a("you do a total of " + currentWeapon.dmg + " damadge");
                    e.describe();
                }
            }
        }

    }

    public void look(String in){
        String[] words = in.split(" ");

        if(words.length >= 2){

            if(items.containsKey(words[1])){
                Describe d = items.get(words[1]);
                d.describe();
            }else{
                if(currentRoom.enemies.containsKey(words[1])){
                    currentRoom.enemies.get(words[1]).describe();
                }else if(words[1].equals("room")){
                    currentRoom.describe();
                }else if(words[1].equals("sky")){
                    a("It's dark.. sooo dark");
                }else if(words[1].equals("inventory")){
                    for(String key : items.keySet()){
                        a(key);
                    }
                }else if(companion != null && words[1].equals(companion.name.toLowerCase())){
                    companion.describe();
                }else if(words[1].equals("me") || words[1].equals(player.name)){
                    player.describe();
                }
            }
        }else{
            currentRoom.describe();
        }
    }

    public void use(String in){
        String[] words = in.split(" ");
        if(words.length >= 2){

            // Firsts word is Use
            // Second words is something
            if(useables.containsKey(words[1])){
                Useable u = useables.get(words[1]);
                if(u instanceof Weapon){
                    currentWeapon = (Weapon) u;
                }
                u.use();
            }else{
                a("Could not find " +  words[1]);
            }
        }else{
            a("Use what?");
        }
    }

    public void a(String s){
        System.out.println(s);
    }

    public void p(){
        for(int i = 0; i < 100; i++){
            System.out.println(System.lineSeparator());
        }
    }

    public void printHelp(){
    a("These are you commands:");
    a("Use, Look, Hit");
    a("Use them well, with limited power comes limited responsebility");
    a("To see your inventory type \"look invenotry\"");
    a("To leave the game type EXIT");
}

}
