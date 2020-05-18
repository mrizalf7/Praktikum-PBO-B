package ShapePackages;

public class Square {
	private double a;
	private double b;
	
	
	public Square(double a) {
		this.a=a;
		
	}
	public Square () {
		
	}
	public void setSquareFirstSide(double a) {
		this.a=a;
	}

	public double SquareArea() {
		b=a*a;
		return b;
	}

	public String toString() {
		String s = "The Area of Square is "+SquareArea();
		return s;
	}
	
}
