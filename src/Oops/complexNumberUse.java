package Oops;

public class complexNumberUse {

	public static void main(String[] args) {
		
		complexNumber c1=new complexNumber(2,3);
		c1.print();
		c1.setReal(4);
		c1.setImaginary(10);
		c1.print();
		
		complexNumber c2=new complexNumber(2,3);
		c1.add(c2);
		c1.print();
		c2.print();
		
		complexNumber c3=new complexNumber(2,3);
		c3.multiply(c2);
		c3.print();
		c2.print();
		
		complexNumber c4=complexNumber.add(c1,c2);
		c1.print();
		c2.print();
		c4.print();

	}

}
