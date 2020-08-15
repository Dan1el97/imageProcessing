package tasks;
import java.util.Date;
import java.util.Scanner;
class Student{
	static int numberOfObjects = 0;
	private String fName; 
	private String sName;
	private String lName;
	private int studentYear; 
	private	String spec;
	private	String university;
	private	String email;
	private	String telNumber;
	public Student() {
		numberOfObjects++;
		fName = null; 
		sName = null;
		lName = null;
		studentYear = 0; 
		spec = null;
		university = null;
		email = null;
		telNumber = null;
	}
	public Student(String fName, String lName, String telNumber) {
		numberOfObjects++;
		this.fName = fName;
		sName = null;
		this.lName = lName;
		studentYear = 0; 
		spec = null;
		university = null;
		email = null;
		this.telNumber = telNumber;
	}
	public Student(String fName, String lName, String spec, String university) {
		numberOfObjects++;
		this.fName = fName;
		sName = null;
		this.lName = lName;
		studentYear = 0; 
		this.spec = spec;
		this.university = university;
		email = null;
		this.telNumber = null;
	}
	public Student(String fName, String sName, String lName, int studentYear, 
			String spec, String university, String email, String telNumber) {
		numberOfObjects++;
		this.fName = fName;
		this.sName = sName;
		this.lName = lName;
		this.studentYear = studentYear; 
		this.spec = spec;
		this.university = university;
		this.email = email;
		this.telNumber = null;
	}
	public String getFName() {
		return this.fName;
	}
	public void setFName(String fName) {
		this.fName = fName;
	}
	public String getSName() {
		return this.sName;
	}
	public void setSName(String sName) {
		this.sName = sName;
	}
	public String getLName() {
		return this.lName;
	}
	public void setLName(String lName) {
		this.lName = lName;
	}
	public int getStudentYear() {
		return this.studentYear;
	}
	public void setStudentYear(int studentYear) {
		this.studentYear = studentYear;
	}
	public String getSpec() {
		return this.spec;
	}
	public void setSpec(String spec) {
		this.spec = spec;
	}
	public String getUniversity() {
		return this.university;
	}
	public void setUniversity(String university) {
		this.university = university;
	}
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelNumber() {
		return this.telNumber;
	}
	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	void info() {
		System.out.println("\t\t STUDENT INFO");
		System.out.println("Name: " + this.fName + " " + this.sName + " " + this.lName + "\n" 
				+ "University: " + this.university + ", Spec: " + this.spec + ", Year: "
				+ this.studentYear + "\n"
				+ "Email: " + this.email + "\n"
				+ "Telephone number: " + this.telNumber);
	}
}
public class MainClass{
	public static void main(String[] args){
		Student s1 = new Student("Grigor", "Petkov", "Iliev", 4, "KST", "TU-Plovdiv",
				"www.whiplash@abv.bg", "35977287421");
		s1.info();
		Student s2 = new Student("Ivan", "Petrov", "0877675643");
		s2.info();
		s2.setFName("Marian");
		s2.info();
		System.out.println("Number of objects of type Student: " + Student.numberOfObjects);
		
	}
}
