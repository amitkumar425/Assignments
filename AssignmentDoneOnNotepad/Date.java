import java.util.*;
class Date{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int date=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		String s="";
		if(date<=0 || date>31 || month<=0 || month>12){
			System.out.println("Inva;id Details");
			java.lang.System.exit(0);
		}
		switch(month){
			case 01: s = "January";
					 break;
			case 02: s = "February";
					 break;
			case 03: s = "March";
					 break;
			case 04: s = "April";
					 break;
			case 05: s = "May";
					 break;
			case 06: s = "June";
					 break;
			case 07: s = "July";
					 break;
			case 8: s = "August";
					 break;
			case 9: s = "September";
					 break;
			case 10: s = "October";
					 break;
			case 11: s = "November";
					 break;
			case 12: s = "December";
					 break;		 
		}
		System.out.println(date+"/"+s+"/"+year);
	}
}