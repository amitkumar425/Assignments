import java.util.*;
class Table1{
	static int square( int a)
	{
		return a*a;
	}
	
	public static void main(String args[]){
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		a=sc.nextInt();
		System.out.println(a + "*" + "1 = "+square(a));
		
	}
	
	
}
