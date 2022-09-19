package RFDpract;

import java.util.Scanner;

public class Frequency {
	public static String pavan(String kalyan) {
		Scanner sc= new Scanner(System.in);
		 kalyan=sc.next();
		 char b[]=kalyan.toCharArray();
		 for(char c='a';c<='z';c++) {
			 int count=0;
			 for(int i=1;i<kalyan.length();i++) {
				 if(b[i]==c) {
					 count++;
				 }
			 }
			 if(count>0) {
				 System.out.println(c+"="+count);
				
			 }
			 
		 }
		 return kalyan;
		
	}

}
