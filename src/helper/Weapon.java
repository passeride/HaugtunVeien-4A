package helper;

public abstract class Weapon extends Item{
    public int dmg = 1;

    public void describe(){
        System.out.println("DMG: " + dmg);
    }

}
