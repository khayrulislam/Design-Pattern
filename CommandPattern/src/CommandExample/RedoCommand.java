package CommandExample;

public class RedoCommand implements ICommand{

	private Circle circle;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		CommandStorage cs = CommandStorage.getCommandStorageInstance();
		circle = cs.addPreviousCircle();
		print();
	}
	
	private void print() {
		if(circle == null) {
			System.out.println("Nohing to redo");
		}
		else {
			System.out.println("A circle is created again.");
			circle.printCircleInfo();
		}
	}
	
	

}
