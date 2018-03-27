package FactoryExample;

public class StealDoor implements IDoor {

	@Override
	public void createDoor() {
		System.out.println("Steal door is created");
	}

}
