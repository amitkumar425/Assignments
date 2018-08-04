//Class with four instance member with different access specifier

public class Check {
	static int i=20;
	public static int j=10;
	protected static int k=40;
	private int l=50;
	
	//method for providing the value for private instance members
	public void disp() {
		System.out.println("l="+l);
	}
}
