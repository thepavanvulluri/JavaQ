package RFDpract;

public class Stringpali {
	public static void main(String[] args) {
		String s1="121";
		String s2="";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
			
		}
		if (s1.equals(s2)) {
			System.out.println("yes palindrom");}
		
		else {
			System.out.println("no palindrom");
		}
	}
	


}
