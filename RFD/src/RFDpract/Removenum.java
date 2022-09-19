package RFDpract;

public class Removenum {
	public Removenum(int a) {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Removenum e=new Removenum(10);

	String s1="12pavan123";
	String s2="";
	char c[]=s1.toCharArray();
	for(int i=0;i<s1.length();i++) {
		if(Character.isDigit(c[i])){
			s2=s2+c[i];
			
	
		}
	}
		System.out.println(s2);
}
	}
