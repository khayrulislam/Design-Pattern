package CommandExample;

import java.util.Scanner;

public class Controller {
	Scanner sc;
	String command;
	CommandFactory cf;
	
	private void initialize() {
		sc = new Scanner(System.in);
		cf = new CommandFactory();

	}
	
	public void ControlCommand() {
		initialize();
		while(true) {
			System.out.println("Enter your command :");
			command = sc.nextLine();
			if(command.equals("exit")) break;
			cf.getCommand(command).execute();
			
		}
	}
	
}
