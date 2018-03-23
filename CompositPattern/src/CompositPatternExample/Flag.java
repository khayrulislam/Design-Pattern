package CompositPatternExample;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class Flag extends CompositShap {

	private ArrayList<Point> pointList = new ArrayList<>();
	private int radious;
	private Point circleCenter;
	private int width,hight;
	
	public Flag( ArrayList<Point> pointList, Point circleCenter, int radious) {
		// TODO Auto-generated constructor stub
		width = pointList.get(1).getX() - pointList.get(0).getX();
		hight = pointList.get(pointList.size()-1).getY() - pointList.get(0).getY();
		this.pointList = pointList;
		this.radious = radious;
		this.circleCenter = circleCenter;
	}
	
	@Override
	public void buildShape(Graphics g) {
		// TODO Auto-generated method stub
		new Rectangle(pointList).drawShap( g);
		g.setColor(Color.GREEN);
		g.fillRect(pointList.get(0).getX(), pointList.get(0).getY(), width, hight);
		
		new Circle(circleCenter,radious).drawShap( g);
		g.setColor(Color.red);
		g.fillOval(circleCenter.getX(), circleCenter.getY(), radious, radious);
	}

}
