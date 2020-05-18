package ShapePackages;

public class Parallelogram {
	private double a;
	private double b;
	private double c;
	
	
	public Parallelogram(double a,double b) {
		this.a=a;
		this.b=b;
	}
	public Parallelogram () {
		
	}
	public void setParallelogramAlas(double a) {
		this.a=a;
	}
	public void setParallelogramHeight(double b) {
		this.b=b;
	}
	public double ParallelogramArea() {
		c=a*b;
		return c;
	}
	
	public String toString() {
		String s = "The Area of Parallelogram is "+ParallelogramArea();
		return s;
	}
	
}
