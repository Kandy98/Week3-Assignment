package shapes;

public class Shapes {
	private int numberOfSides;
	
	public void calculateShapeArea(int shape, int length) {
		if(numberOfSides == 1) {
			 Circle circle = new Circle(length);	 
			 System.out.println("The Area of the Circle is " + circle.claculateArea());
		}
		
		else if(numberOfSides == 3) {
			Triangle triangle = new Triangle(length);
			System.out.println("The Area of the Triangle is " + triangle.claculateArea());
		}
		
		else if(numberOfSides == 4) {
			Square square = new Square(length);
			System.out.println("The Area of the Square is " + square.claculateArea());
		}
		else {
			System.out.println("No Shape Present");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shapes shape = new Shapes();
		
		//Case1
		shape.numberOfSides = 3;
		shape.calculateShapeArea(3, 12);
		
		//Case2
		shape.numberOfSides = 4;
		shape.calculateShapeArea(4, 15);
		
		//Case3
		shape.numberOfSides = 5;
		shape.calculateShapeArea(5, 15);
	}

}
