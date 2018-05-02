package FlyWeightExample;

import java.awt.Color;

public class Letter {

	
	private String name;
	
	private Color color;
	
	private int size;
	
	public Letter(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
