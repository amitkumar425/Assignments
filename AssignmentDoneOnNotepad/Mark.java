import java.util.*;
class Mark{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		float s1=sc.nextFloat();
		float s2=sc.nextFloat();
		float s3=sc.nextFloat();
		if(s1>60 && s2>60 && s3>60){
			System.out.println("You are Passed");
		}
		else if((s1>60 && s2>60) || (s1>60 && s3>60) || (s2>60 && s3>60)){
			System.out.println("You are promoted");
		}
		else{
			System.out.println("You are failed");
		}
	}
}