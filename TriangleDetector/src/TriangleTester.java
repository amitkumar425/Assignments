//Driver class for Triangle.java
//It creates Various triangle objects and checks for their type.

public class TriangleTester {

	public static void main(String[] args) {
		
		//creating Triangle objects with different values to their parameter 
		Triangle firstTriangle = new Triangle(30, 30, 30);
		Triangle secondTriangle = new Triangle(3, 4, 5);
		Triangle thirdTriangle = new Triangle(30, 30, 60);
		Triangle fourthTriangle = new Triangle(30, 32, 35);

		//checking the type of all the Triangle Objects
		System.out.println("firstTriangle is Equilateral Traingle : " + firstTriangle.isEquilateral());
		System.out.println("secondTriangle is Right Angled Triangle : " + secondTriangle.isRight());
		System.out.println("thirdTriangle is Isosceles Triangle : " + thirdTriangle.isIsosceles());
		System.out.println("fourtTriangle is Scalene Triangle : " + fourthTriangle.isScalene());

		System.out.println("firstTriangle is Rigth Traingle : " + firstTriangle.isRight());
	}

}
