package CompositPatternExample;

import java.awt.Graphics;

public class Line implements IShap {
	
	private Point p1, p2;
	
	public Line(Point p1, Point p2) {
		// TODO Auto-generated constructor stub
		this.p1 = p1;
		this.p2 = p2;
	}
	
	@Override
	public void drawShap(Graphics g) {
		// TODO Auto-generated method stub
		//System.out.println(p1.getX()+"  "+p1.getY()+"  ---  "+p2.getX()+"   "+p2.getY());
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		//System.out.println("draw line");
	}

}
