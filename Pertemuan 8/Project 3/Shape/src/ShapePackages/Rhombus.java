package ShapePackages;

public class Rhombus {
	private double a;
	private double b;
	private double c;
	
	public Rhombus(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public Rhombus () {
		
	}
	public void setRhombusFirstDiagonal(double a) {
		this.a=a;
	}
	public void setRhombusSecondDiagonal(double b) {
		this.b=b;
	}
	public double RhombusArea() {
		c=a*b/2;
		return c;
	}
	
	public String toString() {
		String s = "The Area of Rhombus is "+RhombusArea();
		return s;
	}
	
}
