package Oops;

public class complexNumber {

	int real;
	int imaginary;
	
	public complexNumber (int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	
	
	public void print() {
		System.out.println(real + " "+ "+" +" "+ ("i")+imaginary);
	}
	
	public void setReal(int num) {
		this.real=num;
	}
	public void setImaginary(int num) {
		this.imaginary=num;
	}
	
	public void add (complexNumber c2) {
		this.real=this.real+c2.real;
		this.imaginary=this.imaginary+c2.imaginary;
	}
	
	public void multiply (complexNumber c2) {
		this.real=(this.real*c2.real)- (this.imaginary*c2.imaginary);
		this.imaginary=this.real+c2.imaginary+this.imaginary+c2.real;
	}
	
	public static complexNumber add(complexNumber c1 ,complexNumber c2) {
		int newRealNum =c1.real+c2.real;
		int newImagNum =c1.imaginary+c2.imaginary;
		complexNumber c4 = new complexNumber(newRealNum,newImagNum);
		return c4;
	}
}
