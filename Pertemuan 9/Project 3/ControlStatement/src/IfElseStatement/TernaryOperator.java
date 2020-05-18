package IfElseStatement;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello";
		String s2 = "Goodbye";
		if (s1.contentEquals(s2))
			System.out.println("Yes");
		else
			System.out.println("No");
		String s3 = "Hello";
		String s4 = "Goodbye";
		String answer = s3.equals(s4)?"Yes":"No";
		System.out.println(answer);
		
		int c = 3, b=2;
		System.out.println("min = "+(b>c?b:c));
		int a = -10;
		int absValue = (a<0)?-a:a;
		System.out.println("abs = "+absValue);
		float result = true ? 1.0f:2.0f;
		System.out.println("float = "+result);
		
		String s = false? "Dude that was true ": "Sorry Dude, it's false";
		System.out.println(s);
	}

}
