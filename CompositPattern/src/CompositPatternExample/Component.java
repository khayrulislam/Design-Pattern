package CompositPatternExample;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class Component extends JFrame {
	
	public Component() {
		createWindow();
	}
	
	public void paint(Graphics g) {
		new Flag(getRectangleCooRdinate(), new Point(130, 115), 30).buildShape(g);
	}
	
	public void createWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
	}
	
	public ArrayList<Point> getRectangleCooRdinate() {
		int [] x = {100,200,200,100};
		int [] y = {100,100,160,160};	
		ArrayList<Point> list = new ArrayList<>();
		for(int i=0;i<x.length;i++) list.add(new Point(x[i], y[i]));	
		return list;
	}

}
