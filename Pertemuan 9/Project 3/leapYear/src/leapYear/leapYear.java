package leapYear;
import java.util.*;
public class leapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Enter a month:");
		int m = in.nextInt();
		if(m>12 || m<1) {
			System.out.println("Invalid month!!");
		}
		System.out.println("Enter a year:");
		int y = in.nextInt();
		System.out.println("Numbers of days:");
		int d = in.nextInt();
		if(y%4==0 && y%100!=0 || y%400==0) {
			System.out.println("It's a leap year!!!");
			
				System.out.println(d==28?"Leap year with 28 days":null);
			
			if(d==29) {
				System.out.println("Leap year with 29 days");
			}
			else {
				System.out.println("Invalid days for a leap year");
			}
		}
		else {
			System.out.println("It's not a leap year.");
		
		switch(d) {
		case 30:
			System.out.println("Not a leap year with 30 days");
			break;
		case 31:
			System.out.println("Not a leap year with 31 days");
			break;
		default:
			System.out.print("Invalid days for not a leap year ");
		}
	}
		System.out.println(m%2==0?"Even month":"Odd month");
	}
}
