package FactoryExample;

public class GlassWindow implements IWindow{

	@Override
	public void createWindow() {
		System.out.println("create Glass window");
	}

}
