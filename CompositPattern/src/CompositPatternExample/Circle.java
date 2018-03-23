package CompositPatternExample;

import java.awt.Graphics;

public class Circle implements IShap{

	private Point p;
	private int radious;
	
	public Circle(Point p, int radious) {
		// TODO Auto-generated constructor stub
		this.p = p;
		this.radious = radious;
	}
	
	@Override
	public void drawShap(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(p.getX(),p.getY(),radious,radious);
		//System.out.println("draw circle");
	}

}
