//This class Checks the various sides of the triangle and tells if it is the asked 
//type of triangle or not

public class Triangle {
	private double firstSide;
	private double secondSide;
	private double thirdSide;
	
	public Triangle(double firstSide, double secondSide, double thirdSide) {	
		this.firstSide = firstSide;
		this.secondSide = secondSide;
		this.thirdSide = thirdSide;
	}
	
	//Checks if the triangle is Right triangle or not
	public boolean isRight() {
		
		//Using ternary operators to find out the largest side of the triangle
		double largestSide=firstSide>secondSide?firstSide>thirdSide?firstSide:thirdSide:secondSide>thirdSide?secondSide:thirdSide;
		if(largestSide==firstSide) {
			if(Math.pow(largestSide, 2)==(Math.pow(secondSide, 2)+Math.pow(thirdSide, 2))) {
				return true;
			}
			else {
				return false;
			}
		}
		else if(largestSide==secondSide) {
			if(Math.pow(largestSide, 2)==(Math.pow(firstSide, 2)+Math.pow(thirdSide, 2))) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			if(Math.pow(largestSide, 2)==(Math.pow(firstSide, 2)+Math.pow(secondSide, 2))) {
				return true;
			}
			else {
				return false;
			}
		}
	}
	

	//Checks if the triangle is Scalene triangle or not
	public boolean isScalene() {
		if(firstSide!=secondSide && secondSide!=thirdSide && thirdSide!=firstSide) {
			return true;
		}
		else {
			return false;
		}
	}
	

	//Checks if the triangle is Isosceles  triangle or not
	public boolean isIsosceles() {
		boolean firstConditionCheck=(firstSide==secondSide && secondSide!=thirdSide)?true:false;
		boolean secondConditionCheck=(firstSide==thirdSide && secondSide!=thirdSide)?true:false;
		boolean thirdConditionCheck=(secondSide==thirdSide && secondSide!=firstSide)?true:false;
		if(firstConditionCheck==true || secondConditionCheck==true || thirdConditionCheck==true) {
			return true;
		}
		else {
			return false;
		}
	}
	

	// Checks if the triangle is Equilateral triangle or not
	public boolean isEquilateral() {
		if(firstSide==secondSide && secondSide==thirdSide) {
			return true;
		}
		else {
			return false;
		}
	}
}
