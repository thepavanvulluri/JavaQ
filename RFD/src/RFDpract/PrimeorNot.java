package RFDpract;

public class PrimeorNot {

	public static void main(String[] args) {
		int s1=13;
		boolean b =true;
		for(int i=2;i<s1;i++) {
			if(s1%i==0) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println("it is a prime");
		}else
		{
			System.out.println("it is not a prime");
		}
	}
}
