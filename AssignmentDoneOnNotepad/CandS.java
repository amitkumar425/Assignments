import java.util.*;
import java.lang.Math.*;
class CandS{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int r=sc.nextInt();
		int t=sc.nextInt();
		int si=(p*r*t)/100;
		double ci=p*(Math.pow((double)(1+r),(double)t)+1);
		System.out.println("The SI = "+si+" and the CI = "+ci);
	}
}