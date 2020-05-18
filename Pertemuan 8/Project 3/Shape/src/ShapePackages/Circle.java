package ShapePackages;

public class Circle {
	private double pi = 3.14;
	private double r;
	
	public Circle(double r) {
		this.r=r;
	}
	public Circle () {
		
	}
	public void setR(double r) {
		this.r=r;
	}
	public double getR() {
		return r;
	}
	public double AreaR() {
		double Area = pi*r*r;
		return Area;
	}
	public String toString() {
		String s = "The Area of Circle is "+AreaR();
		return s;
	}
	
}
