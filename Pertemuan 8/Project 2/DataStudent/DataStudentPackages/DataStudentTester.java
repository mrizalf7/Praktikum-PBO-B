package DataStudentPackages;

public class DataStudentTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(123,"Mary Smith","123123",3.4);
		System.out.println(s1);
		Student s2 = new  Student();
		s2.setStudentId(114);
		s2.setStudentName("John David");
		s2.setStudentSsn("241521");
		s2.setStudentGpa(4.0);
		System.out.println(s2);
		Student s3 = new Student();
		System.out.println(s3);

	}

}
