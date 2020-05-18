package ShapePackages;

public class Triangle {
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public Triangle () {
		
	}
	public void setTriangleFirstSide(double a) {
		this.a=a;
	}
	public void setTriangleSecondSide(double b) {
		this.b=b;
	}
	public double TriangleArea() {
		c=a*b/2;
		return c;
	}

	public String toString() {
		String s = "The Area of Triangle is "+TriangleArea();
		return s;
	}
	

}
