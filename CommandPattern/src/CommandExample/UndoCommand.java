package CommandExample;

public class UndoCommand implements ICommand{

	private Circle circle;
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		CommandStorage cs = CommandStorage.getCommandStorageInstance();
		circle = cs.removeCircle();
		print();
	}
	
	private void print() {
		
		if(circle==null) {
			System.out.println("No circle exist nothing to undo.");
		}
		else {
			System.out.println("A circle is removed currently.");
			circle.printCircleInfo();
		}
		
	}

}
