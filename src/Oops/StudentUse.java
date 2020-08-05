package Oops;
import java.util.Scanner;
public class StudentUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   System.out.println(Student.getNumStudent());

        Student s1 = new Student("rakesh");
        
        Student s2 = new Student("barsha");
        
        System.out.println(s1.getNumStudent() +" "+ s2.getRollNumber());
        System.out.println(s2.getNumStudent() +" "+ s1.getRollNumber());
//        System.out.println("s1" +" "+ s1);
//        System.out.println(s2);
//        s2.name = "Rakesh";
       
//        System.out.println(s2.name + " " + s2.getRollNumber());
	}

}
