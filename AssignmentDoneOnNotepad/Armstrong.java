import java.io.*;
import java.util.*;
class Armstrong{
	public static void main(String srgs[]){
		int res=0,power=1,cpy=0;
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		cpy=a;
		String s=Integer.toString(a);
		int len=s.length();
		for(int i=0;i<len;i++){
			int b=a%10;
			a=a/10;
			for(int j=0;j<len;j++){
				power*=b;
			}
			res+=power;
			power=1;
		}
		if(cpy==res){
			System.out.println(cpy+" is an Armstrong Number");
		}
		else{
			System.out.println(cpy+" is not an Armstrong Number");
		}
	}
}