package javaset2;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>18) {
			System.out.println("yes elgile to vote");
		}else 
			throw new ArrayStoreException("not elgible for vote");
			
		
	}

}
