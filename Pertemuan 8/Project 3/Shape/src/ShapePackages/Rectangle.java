package ShapePackages;

public class Rectangle {
	private double a;
	private double b;
	private double c;
	
	public Rectangle(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public Rectangle () {
		
	}
	public void setRectangleFirstSide(double a) {
		this.a=a;
	}
	public void setRectangleSecondSide(double b) {
		this.b=b;
	}
	public double RectangleArea() {
		c=a*b;
		return c;
	}

	public String toString() {
		String s = "The Area of Rectangle is "+RectangleArea();
		return s;
	}
	
}
