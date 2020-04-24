package shapes;

public class Triangle {

	private int side;
		
	public Triangle(int side) {
		super();
		this.side = side;
	}

	public float claculateArea() {
		float area =(float) 0.433*side*side;
		
		return area;
	}
}
