import java.util.*;
class CUI{
	public static void main(String args[]){
		int i=3;
		String c_usr="amit";
		String c_pass="password";
		Scanner sc = new Scanner(System.in);
		do{
			String usr=sc.nextLine();
			String pass=sc.nextLine();
			if(usr.equals(c_usr) && (pass.equals(c_pass))){
				System.out.println("Welcome "+usr);
				java.lang.System.exit(0);
			}
		}while(--i>0);
		System.out.println("Contact Admin");
		
	}
}