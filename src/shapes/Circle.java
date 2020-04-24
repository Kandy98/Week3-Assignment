package shapes;

public class Circle {
	
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public float claculateArea() {
		float area = (float) (3.14*radius*radius);
		
		return area;
	}
}
