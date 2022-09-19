package dummy;

public class AmstrongNumber {
	public static void main(String[] args) {
		int i=153;
		int num=i;
		int count=0;
		while(num!=0) {
			count=count+1;
			num=num/10;
		}
		int num2=i;
		int arm=0;
		while(num2!=0) {
			int rem=num2%10;
			int mult=1;
			for(int j=1;j<=count;j++) {
				mult=mult*rem;
			}
			arm=arm+mult;
			num2=num2/10;}
		
		if(arm==i) {
			System.out.println("arm");
		}else {
			System.out.println("not arm");
		
		}
	}

}
