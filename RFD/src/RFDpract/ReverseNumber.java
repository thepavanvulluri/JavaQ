package RFDpract;

public class ReverseNumber { 
		public static void main(String[] args)   
		{  
		int number = 121, reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  
		reverse = reverse * 10 + remainder;  
		number = number/10;  
		}  
		System.out.println(reverse);
		if(number==reverse) {
			System.out.println("pali");
		}else {
			System.out.println("not a pali");
		}
		}
		}  

