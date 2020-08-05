package Oops;

public class fraction {
	int numerator;
	int denominator;


	public fraction (int numerator,int denominator) {
		if(denominator == 0) {
			denominator=1;
		}
		this.numerator=numerator;
		this.denominator=denominator;
		simplyfy();
	}

	private void simplyfy() {
		int gcd =1;
		int smaller = Math.min(numerator, denominator);
		for(int i= 2; i<=smaller; i++) {
			if(numerator % i ==0 && denominator % i == 0) {
				gcd =i;
			}
		}
		numerator =numerator / gcd;
		denominator =denominator /gcd;
	}
	
	public void print() {
		System.out.println(numerator +"/"+ denominator);
		
	}

	public void increment() {
		numerator =numerator+ denominator;
		simplyfy();
	}
	
	
	public void setNumerator(int num) {
		this.numerator =num;
		simplyfy();
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int num) {
		if(num == 0) {
			return;
		}
		this.denominator =num;
		simplyfy();
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void add(fraction f2) {
		//first fraction is the fraction on which function is called
		//second function is passed ad arguments
		this.numerator= this.numerator * f2.denominator + this.denominator * f2.numerator;
		this.denominator=this.denominator * f2.denominator;
		simplyfy();
	}
	
	public static fraction add(fraction f1, fraction f2) {
		int newNum = f1.numerator * f2.denominator + f1.denominator*f2.numerator;
		int newDeno = f1.denominator * f2.denominator;
		fraction f3 = new fraction(newNum,newDeno);
		return f3;
	}
	
	
	
	

}