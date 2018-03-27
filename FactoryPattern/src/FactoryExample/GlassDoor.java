package FactoryExample;

public class GlassDoor implements IDoor{

	@Override
	public void createDoor() {
		System.out.println("glass door created");
	}

}
