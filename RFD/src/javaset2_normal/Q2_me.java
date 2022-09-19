package javaset2_normal;

public class Q2_me {
	public static void main(String[] args) {
		String s1="the man is there and his love is blind";
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c=='s' || c=='t') {
				String dummy="";
				dummy=dummy+c;
				s2=s2+dummy.toUpperCase();
			}	else {
				s2=s2+c;
			}
		}
		System.out.println(s2);
	}
}
