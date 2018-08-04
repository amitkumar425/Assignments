import java.util.*;
class Tax{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		long ctc=sc.nextLong();
		double tax=0;
		if(ctc>0 && ctc<=180000){
			System.out.println("Your Payable tax amount ="+tax);
		}
		else if(ctc>180000 && ctc<=300000){
			tax=0.10*ctc;
			System.out.println("Your Payable tax amount ="+tax);
		}
		else if(ctc>300000 && ctc<=500000){
			tax=0.20*ctc;
			System.out.println("Your Payable tax amount ="+tax);
		}
		else if(ctc>500000 && ctc<=1000000){
			tax=0.30*ctc;
			System.out.println("Your Payable tax amount ="+tax);
		}
	}
}