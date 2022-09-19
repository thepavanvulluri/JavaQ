package RFDpract;

public class Method {

	public static int pavan(String say) {
		String a=say;
		int count=0;
		char c[]=a.toCharArray();
		for(char b='a';b<='z';b++) {
			 count=0;
			for(int i=0;i<a.length();i++) {
				if(c[i]==b) {
					if(c[i]=='a'|| c[i]=='e' ||c[i]=='i' ||c[i]=='o'||c[i]=='o' ) {
						count++;
					}	
				}
			}
			if(count>0) {
				System.out.println(b+" "+count);
				
			}
	}
		return count;
		}

}
