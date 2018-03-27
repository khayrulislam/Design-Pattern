package FactoryExample;

import java.util.HashMap;

public class RoomFactory {

	public IRoom createRoom(String choise) {
		HashMap< String, IRoom> room = new HashMap<>();	
		
		room.put("w", new WoodenRoom());
		room.put("g", new Glassroom());
		room.put("s", new StealRoom());

		return room.get(choise);
		
		
		/*
		if(choise.equals("w")) {
			 return new WoodenRoom();
		}
		else if(choise.equals("g")) {
			return new Glassroom();
		}
		else if(choise.equals("s")) {
			return new StealRoom();
		}*/
		
	}
	
}
