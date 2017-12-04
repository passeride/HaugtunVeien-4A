package com.passeride.textAdventure;

import helper.TAObject;

public class Character extends TAObject{
    public String name = "";
    public String description = "";
    public enum CharacterClass{
        WARRIOR(0), WIZARD(1), ROGUE(2), ACROBAT(3);

        private final int value;
        private CharacterClass(int value){
            this.value = value;
        }

        public int getValue(){
            return this.value;
        }

    }

    public static final String[] classNames = {
        "Warrior", "Wizard", "Rogue", "Acrobat"
    };

    public CharacterClass charClass;


    public int strength = 10, intelligence = 10, aglility = 10;// TODO add more stuff

    public void describe(){
        a(name + " is a " + classNames[charClass.getValue()]);
        a(description);
    }

    public Character(){
        super();
    }

    public void setUpCharacter(){
        a("Choose one of the classes:");
        a("Warrior : Big dum tuk tuk");
        a("Wizard : small smart weakling");
        a("Rogue : Don't trust a selfproclaimed rogue");
        a("Acrobat : he do flips");
        switch(s.nextLine().toLowerCase()){
        case "warrior":
            charClass = CharacterClass.WARRIOR;
            break;
        case "wizard":
            charClass = CharacterClass.WIZARD;
            break;
        case "rogue":
            charClass = CharacterClass.ROGUE;
            break;
        case "acrobat":
            charClass = CharacterClass.ACROBAT;
            break;
        default:
            a("You wrote wrong, you big dum dum");
            charClass = CharacterClass.WARRIOR;
        }
        // Get name
        p(2);
        a("what is this " + classNames[(int)charClass.getValue()] + " called:");
        name = s.nextLine().toLowerCase();

        // Get description
        p(2);
        a("Give a short description of " + name);
        description = s.nextLine();



    }


}
