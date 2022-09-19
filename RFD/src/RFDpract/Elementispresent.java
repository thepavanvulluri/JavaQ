package RFDpract;

import java.util.Scanner;

public class Elementispresent {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hello=sc.nextInt();
		int a[]= {10,20,30,40};
		for(int i=0;i<a.length;i++) {
			if(a[i]==hello) {
				System.out.println("yes number is avaliable");
				break;
			}else {
				System.out.println("no number is avaliable");
				break;
			}
		}
		
		
		
	}

}
