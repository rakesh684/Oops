package Oops;

public class fractionUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fraction f1 = new fraction(4,6);
		f1.print();
//		f1.setNumerator(12);
//		f1.setDenominator(30); 
//		f1.getNumerator();
//		f1.increment();
//		f1.print();
		
		fraction f2 = new fraction(16,40);
		
//		f1.add(f2);
//		f1.print();
		
		fraction f3 = fraction.add(f1,f2);
		f3.print();
	}

}
