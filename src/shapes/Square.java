package shapes;

public class Square {
	
	private int side;
	
	public Square(int side) {
		super();
		this.side = side;
	}

	public int claculateArea() {
		int area = side*side;
		
		return area;
	}
}
