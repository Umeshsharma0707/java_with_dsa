package oops;

class Student{
	// properties means data members
	
	int studentId;
	String studentName;
	String studentClass;
	static String schoolName = "abc school";
		
	public Student() {
		System.out.println("creating object");
	}
	public Student(int studentId, String studentName,String studentClass) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentClass = studentClass;
	}
	
	// behaviour means methods
	
	public void isStudy(boolean flag) {
		if(flag == true) {
			System.out.println("student is studying");
		}else {
			System.out.println("student is not studying");
		}
	}
	public void showStudentDetails() {
		System.out.println("Name : " + studentName);
		System.out.println("Student Id :" + studentId);
		System.out.println("class : " + studentClass);
		System.out.println("School Name : " + schoolName);
	}
}
public class ClassesAndObject {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		s1.studentName = "umesh";
		s1.studentId = 10;
		s1.studentClass = "VI th ";
//		s1.schoolName = "abd";
		s1.showStudentDetails();
		s1.isStudy(true);
		Student s2 = new Student(11,"ram","10th");
		s2.showStudentDetails();
		s2.isStudy(false);
	}
}
