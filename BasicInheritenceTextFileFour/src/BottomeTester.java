//Driver class to check the upcasting and hirarichal  inheritance 

public class BottomeTester {

	public static void main(String[] args) {
		
		//Reference of the parent class which is abstract
		Top top;
		
		//Creating Object of BottomOne
		top = new BottomOne();
		top.disp();
		
		//Creating Object of BottomTwo
		top = new BottomTwo();
		top.disp();
		
		//Creating Object of BottomThree
		top = new BottomThree();
		top.disp();
	}

}
