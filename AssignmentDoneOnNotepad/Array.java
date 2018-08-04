import java.util.*;
class Array{
	public static void main(String args[]){
		int[] arr=new int[]{ 15 , 13 , 14 , 12 , 9 , 10 , 11 , 8 , 7 , 5 , 6 , 4 , 2 , 3 , 1 };
		System.out.println("Enter the number to be searched");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<15;i++){
			if(arr[i]==a){
				System.out.println("Element found");
				java.lang.System.exit(0);
			}
		}
		System.out.println("Element Not found");
	}
}