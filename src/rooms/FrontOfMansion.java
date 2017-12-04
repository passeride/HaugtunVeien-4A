package rooms;

import helper.Room;

public class FrontOfMansion extends Room {
	
	public boolean firstTime = true;
	
	public FrontOfMansion() {
		rooms.put("FrontOfMansion", this);
		Doors[Room.ROOM_NORTH] = (Room) new Hallway();
	}
	
	public void enter() {
		if(firstTime) {
			firstTime = false;
			a("Uncle Hammon sendt a letter, not a long letter, just two words to break a decade silence");
			a("We where never close, i just assumed the other side of my family was working on getting their cameo in the will, and that kept him bizy");
			a("I thought some of my family had used half a lifetime sucking up to him, hoping he would delivere completion");
			a("And yet he sendt me a letter, did he know i would not be able to refuse? two simple words");
			a("Hoping this was more than a stroke, i packed my bags and moved at once, as i felt the gate squeeking in my hand. I read the message again.");
			p(2);
			a(" \"IT'S NOW!\" ");
			
		}else {
			a("The entrance used to be nice once, it used to be a place to think");
		}
	}
	
	public void describe() {
		a("Uncle Hammonds old mansion looks sinister as allwasys");
		a("It's in good shape, and itself is a handsome building, i guess the sinester feel i have originate from history");
		a("Rigth infornt(north) of me is the door, it's dark on the inside, there is no welcome mat");
		a("To my right(east) is a tiny track leading around to the back of the house");
		a("Why would he message me to come here?");
		
	}
	
}
