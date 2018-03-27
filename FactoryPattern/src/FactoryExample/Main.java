package FactoryExample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		sc.close();
		
		IRoom r = new RoomFactory().createRoom(input);
		r.createRoom();
		*/
		
		

		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		sc.close();
		
		AbstructFactory familyFactory = new AllFactory().getAFactory(input);
		
		IWindow w = familyFactory.createWindow();
		w.createWindow();
		IRoom r = familyFactory.createRoom();
		r.createRoom();
		IDoor d = familyFactory.createDoor();
		d.createDoor();
		
		
		
	}
	
	
}
