package FactoryExample;

public abstract class AbstructFactory {

	public abstract IRoom createRoom();
	
	public abstract IDoor createDoor();
	
	public abstract IWindow createWindow();
}
