package Example;

public abstract class Trip {

	// execute method is a templet method
	
	public void execute() {
		journyFromDhakaToCox();
		romingAround();
		journeyFromCoxToDhaka();
	}
	
	public abstract void journyFromDhakaToCox();
	public abstract void romingAround();
	public abstract void journeyFromCoxToDhaka();
	
}
