package CommandExample;

import java.util.HashMap;

public class CommandFactory {

	HashMap<String, ICommand> commandMap = new HashMap<String, ICommand>();
	
	public CommandFactory() {
		commandMap.put("do", new DoCommand());
		commandMap.put("undo", new UndoCommand());
		commandMap.put("redo", new RedoCommand());
	}
	
	public ICommand getCommand(String command) {
		return commandMap.get(command);
	}
}
