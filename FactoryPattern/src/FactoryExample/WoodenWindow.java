package FactoryExample;

public class WoodenWindow implements IWindow {

	@Override
	public void createWindow() {
		System.out.println("wooden window created");
	}

}
