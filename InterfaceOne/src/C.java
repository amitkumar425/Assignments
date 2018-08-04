//Class implementing the interface B which intern extends interface A
public class C implements B {

	@Override
	public void disp1() {
		System.out.println("disp1() of Inteface A");
	}

	@Override
	public void disp2() {
		System.out.println("disp2() of Inteface B");

	}

	public void disp3() {
		System.out.println("disp2() of Class C");

	}

}
