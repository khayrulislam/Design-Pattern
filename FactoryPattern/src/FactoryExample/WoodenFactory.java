package FactoryExample;

public class WoodenFactory extends AbstructFactory {

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new WoodenRoom();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new WoodenDoor();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new WoodenWindow();
	}


}
