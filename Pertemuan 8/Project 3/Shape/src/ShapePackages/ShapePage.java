package ShapePackages;

public class ShapePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Circle c = new Circle (4.2);
	System.out.println(c);
	Circle c1 = new Circle();
	c1.setR(4.1);
	System.out.println(c1);
	Square s = new Square (3);
	System.out.println(s);
	Square s1 = new Square();
	s1.setSquareFirstSide(3.5);
	System.out.println(s1);
	Rectangle r = new Rectangle(4.2,5.3);
	System.out.println(r);
	Rectangle r1 = new Rectangle();
	r1.setRectangleFirstSide(3.5);
	r1.setRectangleSecondSide(4.3);
	System.out.println(r1);
	Triangle t = new Triangle(4.1,5.3);
	System.out.println(t);
	Triangle t1 = new Triangle();
	t1.setTriangleFirstSide(4.25);
	t1.setTriangleSecondSide(4.52);
	System.out.println(t1);
	Rhombus h = new Rhombus(3.12,4.21);
	System.out.println(h);
	Rhombus h1 = new Rhombus();
	h1.setRhombusFirstDiagonal(4.15);
	h1.setRhombusSecondDiagonal(3.51);
	System.out.println(h1);
	Parallelogram p = new Parallelogram(2.1,3.1);
	System.out.println(p);
	Parallelogram p1 = new Parallelogram();
	p1.setParallelogramAlas(10);
	p1.setParallelogramHeight(4.33);
	System.out.println(p1);
	
	
		
	}

}
