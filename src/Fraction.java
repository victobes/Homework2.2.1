
public class Fraction {
	int numerator;
	int denominator = 1;

	public Fraction(int numerator, int denominator) {
		if (denominator == 0) {
			System.out.println("Denominator can't be zero. Choose another one.");
			return;
		}
		this.numerator = numerator;
		this.denominator = denominator;

	}

	public void substaction(Fraction s) {
		if (this.denominator == s.denominator) {
			numerator = numerator - s.numerator;
		} else {
			numerator = numerator * s.denominator - s.numerator * denominator;
			denominator = denominator * s.denominator;
		}
	}

	public void multiplication(Fraction m) {
		numerator = numerator * m.numerator;
		denominator = denominator * m.denominator;
	}

	public void division(Fraction d) {
		numerator = numerator * d.denominator;
		denominator = denominator * d.numerator;
	}
	@Override
	public String toString() {
		if (numerator == denominator) {
			return new StringBuilder().append("1").toString();
		} else {
		return new StringBuilder().append(numerator).append("/").append(denominator).toString();
		}
	}

}
