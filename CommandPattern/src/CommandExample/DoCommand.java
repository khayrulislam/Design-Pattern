package CommandExample;

import java.util.Scanner;

public class DoCommand implements ICommand  {

	private String x,y;
	private Circle circle;
	
	private void getInputFromUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter circle position to create :");
		System.out.println("Enter circle X coordinate = ");
		x = sc.nextLine();
		System.out.println("Enter circle Y coordinate = ");
		y = sc.nextLine();
		circle = new Circle(Integer.parseInt(x), Integer.parseInt(y));
		
	}
	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		getInputFromUser();
		CommandStorage cs = CommandStorage.getCommandStorageInstance();
		cs.addCircle(circle);
		print();
	}
	
	private void print() {
		System.out.println("New circle is created.");
		circle.printCircleInfo();
	}

}
