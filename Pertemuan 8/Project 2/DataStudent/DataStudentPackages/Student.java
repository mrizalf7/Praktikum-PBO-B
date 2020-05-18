package DataStudentPackages;

public class Student {
	int studentId;
	String name;
	String ssn;
	double gpa;
	public Student(int x,String n, String s,double g) {
		studentId = x;
		name = n;
		ssn = s;
		gpa = g;
	}
	public Student(){
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentName(String name) {
		this.name=name;
	}
	public String getStudentName() {
		return name;
	}
	public void setStudentSsn(String ssn) {
		this.ssn=ssn;
	}
	public String getStudentSsn() {
		return ssn;
	}
	public void setStudentGpa(double gpa) {
		this.gpa=gpa;
	}
	public double getStudentGpa() {
		return gpa;
	}
	
	public String toString() {
		String s1;
		s1 = "Student Id:"+getStudentId()+
				" Student Name:"+getStudentName()+
				" Student SSN:"+getStudentSsn()+
				" Student GPA:"+getStudentGpa();
		return s1;
	}

}
