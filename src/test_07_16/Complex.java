package test_07_16;

public class Complex {
	private double real;
	private double im;

	public Complex(double real, double im) {
		this.real = real;
		this.im = im;
	}

	public Complex add(Complex c) {
		double real = this.real + c.real;
		double im = this.im + c.im;
		return new Complex(real, im);
	}

	public Complex add(double real) {
		return new Complex(this.real + real, im);
	}

	@Override
	public String toString() {
		String result = "";
		if (this.real != 0)
			result += real;
		if (im == 1)
			return result += "+i";
		if (im == -1)
			return result += "-i";
		if (this.im < 0)
			result += im + "i";
		else if (im > 0)
			result += "+" + im + "i";
		return result;
	}
}
