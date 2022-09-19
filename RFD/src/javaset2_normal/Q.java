package javaset2_normal;

public class Q {
public static void main(String[] args) {
	String s1=	"pavan you 'are good' hello";
	String s2="";
		String s3[]=s1.split("");
		for(int i=0;i<s2.length();i++) {
			if(s3[i].startsWith("'")&& s3[i].endsWith("'")) {
				String s4="";
				for(int j=s1.length();j<0;j++) {
					s4=s4+s3[i];
					
				}
			}
		}
		
}
}
