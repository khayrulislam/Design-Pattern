package FactoryExample;

public class StealFactory extends AbstructFactory{

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new StealRoom();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new StealDoor();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new StealWindow();
	}

}
