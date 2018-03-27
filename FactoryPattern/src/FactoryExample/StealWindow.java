package FactoryExample;

public class StealWindow implements IWindow{

	@Override
	public void createWindow() {
		System.out.println("Steal window created");
	}

}
