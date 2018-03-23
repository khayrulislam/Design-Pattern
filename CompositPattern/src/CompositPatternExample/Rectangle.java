package CompositPatternExample;

import java.awt.Graphics;
import java.util.ArrayList;

public class Rectangle extends CompositShap {

	ArrayList<IShap> list = new ArrayList<>();
	ArrayList<Point> pointList = new ArrayList<>();
	
	
	public Rectangle( ArrayList<Point> points) {
		// TODO Auto-generated constructor 
		this.pointList = points;
		pointList.add( pointList.get(0) );
	}
	
	
	private void getShapeList() {
		for(int i=0;i<pointList.size()-1;i++) list.add(new Line( pointList.get(i) , pointList.get(i+1) ));
		
	}
	
	@Override
	public void buildShape(Graphics g) {
		// TODO Auto-generated method stub
		getShapeList();
		
		for(IShap s: list) {
			s.drawShap(g);
		}
		
	}

}
