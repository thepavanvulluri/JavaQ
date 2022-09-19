package javaset1;

public class Q5 {
	public static void main(String[] args) {
		int i=12134321;
		int b=i;
		int lastDigit=0;
		int rev=0;
		while(i!=0) {
			lastDigit=i%10;
			rev=rev*10+lastDigit;
			i=i/10;
		}
		System.out.println(rev);
		if(rev==b) {
			System.out.println("palindrom");
			
		}else {
			System.out.println("not a palindrom");
		}
	
	}

}
