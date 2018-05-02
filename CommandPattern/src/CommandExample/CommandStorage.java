package CommandExample;

import java.util.Stack;

public class CommandStorage {
	
	public static CommandStorage cs = null;
	public Stack < Circle > forward = new Stack<>();
	public Stack < Circle > backward = new Stack<>();
	
	
	private CommandStorage() {
		
	}

	public static CommandStorage getCommandStorageInstance() {
	
		if(cs==null) cs = new CommandStorage();
		
		return cs;
	}
	
	public void addCircle(Circle c) {
		forward.push(c);
		backward.clear();
	}
	
	public Circle removeCircle() {
		Circle c = null;
		
		if(!forward.isEmpty()) {
			c = forward.pop();
			backward.push(c);
		}
		
		return c;
	}
	
	public Circle addPreviousCircle() {
		Circle c = null;
		
		if(!backward.isEmpty()) {
			c = backward.pop();
			forward.push(c);
		}
		
		return c;
	}
}
