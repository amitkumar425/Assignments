//Class for performing addition of two complex numbers and also displayin them back

public class Complex {

	// Instance members which must be the part of the complex numbers
	private double real;
	private double imaginary;

	// Method for setting the values for two different parts of a complex number
	public void set(double real, double imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	// method for displaying the complex numbers
	public String disp() {
		String complexNumber = null;
		if (this.imaginary < 0) {
			complexNumber = Double.toString(real) + Double.toString(imaginary) + "j";
		} else
			complexNumber = Double.toString(real) + "+" + Double.toString(imaginary) + "j";
		return complexNumber;
	}

	// method for performing addition of given two complex numbers and returning
	// back the resultant complex number
	public static Complex sum(Complex firstComplex, Complex secondComplex) {
		Complex sum = new Complex();
		sum.real = firstComplex.real + secondComplex.real;
		sum.imaginary = firstComplex.imaginary + secondComplex.imaginary;
		return sum;
	}
}
