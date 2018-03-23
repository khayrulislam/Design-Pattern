package CompositPatternExample;

import java.awt.Graphics;

public abstract class CompositShap implements IShap {

	@Override
	public void drawShap(Graphics g) {
		// TODO Auto-generated method stub
		buildShape( g);
	}
	
	public abstract void buildShape(Graphics g);

}
