import java.io.*;
import java.util.*;
class Armlist{
	static int arm(int num){
		int res=0,power=1,cpy=0;
		String s=Integer.toString(num);
		int len=s.length();
		cpy=num;
		for(int i=0;i<len;i++){
			int b=num%10;
			num=num/10;
			for(int j=0;j<len;j++){
				power*=b;
			}
			res+=power;
			power=1;
		}
		if(cpy==res){
			return 1;
		}
		else{
			return 0;
		}
	}
	public static void main(String srgs[]){
		System.out.println("ArmStrong Numbers are : ");
		for(int i=100;i<1000;i++){
			if(arm(i)==1){
				System.out.println(i);
			}
		}
	}
}