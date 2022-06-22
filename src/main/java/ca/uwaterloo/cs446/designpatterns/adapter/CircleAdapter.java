package ca.uwaterloo.cs446.designpatterns.adapter;

public class CircleAdapter implements Shape {
	private Circle adaptee;
	
	public CircleAdapter(Circle circle) {
		this.adaptee = circle;
	}
	
	@Override
	public void draw(int x, int y, int x2, int y2) {
		adaptee.draw(x1, y1, math.sqrt((x2 - x) ** 2 + (y2 - y) ** 2));
	}
}
