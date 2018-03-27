package FactoryExample;

public class GlassFactory extends AbstructFactory{

	@Override
	public IRoom createRoom() {
		// TODO Auto-generated method stub
		return new Glassroom();
	}

	@Override
	public IDoor createDoor() {
		// TODO Auto-generated method stub
		return new GlassDoor();
	}

	@Override
	public IWindow createWindow() {
		// TODO Auto-generated method stub
		return new GlassWindow();
	}
 
}
