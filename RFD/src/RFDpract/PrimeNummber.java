package RFDpract;

public class PrimeNummber {
	public static void main(String[] args) {
		for(int j=2;j<51;j++) {
		int a=j;
		boolean flag=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=false;
				break;
				
			}
		}
		if(flag==true)
		System.out.println((a));

			//System.out.println("yes prime")
			
		}
		
	}

}
