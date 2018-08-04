import java.util.*;
class Pallindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int copyOfNumber=number;
		int reverseOfNumber=0;
		while(copyOfNumber>0){
			reverseOfNumber=(reverseOfNumber*10)+(copyOfNumber%10);
			copyOfNumber/=10;
		}
		if(reverseOfNumber==number){
			System.out.println("Pallindrome");
		}else{
			System.out.println("Not a Pallindrome");
		}
	}
}