package Oops;
public class Student {

	String name;
	final private int rollNumber;
	double cgpa;
	public final static double conversionfactor = 0.93;
	private static int numStudent;
	
	public int getRollNumber() {
		return this.rollNumber;
	}
//	public void setRollNumber(int rollNumber) {
//		if(rollNumber <=0)
//		{
//			return;
//		}
//		System.out.println("this" +" "+ this);
//		 this.rollNumber =rollNumber;
//	}
	//constructor
	public Student(String name) {
		this.name =name;
		numStudent++;
		this.rollNumber =numStudent;
		
	}
	
//	public Student(String n) {
//		name =n;
//	}
	public static int getNumStudent() {
		return numStudent;
	}
	
	public void print() {
		System.out.println(name +" "+ rollNumber);
	}
}
