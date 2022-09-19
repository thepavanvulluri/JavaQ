package javaset2;

public class Q2_1 {
	public int pavan(int pavan) {
		int s1=pavan;
		int s2=s1;
		int lastDigit=0;
		int reverse=0;
		boolean flag=true;
		while(s1!=0) {
		lastDigit=s1%10;
		reverse=reverse*10+lastDigit;
		s1=s1/10;
		}
		if(s2==reverse)
		{
			System.out.println(flag);
		}else
			System.out.println("false");
		return s1;
	}

}
