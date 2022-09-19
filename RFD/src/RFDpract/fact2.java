package RFDpract;

public class fact2 {
	public static void main(String[] args) {
		
		int i=145;
		int temp=i;
		int sum=0;
		while(i!=0) {
			int fact=1;
		int reminder=i%10;
		for(int j=reminder;j>=1;j--) {
			fact=fact*j;
		}
		sum=sum+fact;
		i=i/10;
		}
		if(temp==sum) {
			System.out.println(fact.m1(1));
		}
		else {
			System.out.println(fact.m2(2));
		
	}

}
}