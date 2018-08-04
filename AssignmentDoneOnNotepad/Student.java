
//NOT COMPLETED 
import java.util.*;
class Subject{
	float a[] = new float[]{0,0,0};
}
class Student{
	public static void main(String args[]){
		float grandTotal=0,grandAvg=0;
		try{
			Subject[] s=new Subject[3];
			for(int i=0;i<3;i++){
				s[i]=new Subject();
			}
			float[] total=new float[]{0,0,0};
			float[] avg=new float[]{0,0,0};
			Scanner sc = new Scanner(System.in);
			for(int i=0;i<3;i++){
				for(int j=0;i<3;j++){
					s[i].a[j]=sc.nextFloat();
					total[i]+=s[i].a[j];
					grandTotal+=s[i].a[j];
				}
				avg[i]=total[i]/3;
			}
			grandAvg=grandTotal/3;
			System.out.println("Student Wise");
			System.out.println("Total Average");
			for(int i=0;i<3;i++){
				System.out.println(total[i]+" "+avg[i]);
			}
			System.out.println("Grand Total = "+grandTotal+" and Grand Average = "+grandAvg);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
}