package items;

import helper.Weapon;

public class Bat extends Weapon{

    public Bat(){
        dmg = 10;
    }

    public void use(){
        System.out.println("You equip the bat");
    }
    public void describe(){
        super.describe();
        System.out.println("You know bats right? This is one of the nicer ones");

    }
}
