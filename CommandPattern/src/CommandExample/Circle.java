package CommandExample;

public class Circle {

	private int x,y;
	
	public Circle(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void printCircleInfo() {
		System.out.println("Circle's current X is = "+x);
		System.out.println("Circle's current Y is = "+y);
	}
	
}
