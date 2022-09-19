package RFDpract;

public class Amstrorng {
	public static void main(String[] args) {
		int i=13;
		int num=i;
		int count=0;
		while(num!=0){
			count=count+1;
			num=num/10;
		}
		int num1=i;
		int arm=0;
		while(num1!=0) {
			int rem=num1%10;
			int mult=1;
			for(int j=1;j<=count;j++) {
				mult=mult*rem;
			}
			arm=arm+mult;
			num1=num1/10;
		}
		if(arm==i) {
			System.out.println("arm");
		}else {
			System.out.println("not a arm");
		}
			
		
	}
	
	}
	

