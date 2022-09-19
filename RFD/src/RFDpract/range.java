package RFDpract;

public class range {

		public static void main(String[] args) {
			for(int j=2;j<=100;j++) {
			int s1=j;
			boolean b =true;
			for(int i=2;i<s1;i++) {
				if(s1%i==0) {
					b=false;
					break;
				}
			}
			if(b==true) {
				System.out.println(s1);
		
			}
		}}} 
	
