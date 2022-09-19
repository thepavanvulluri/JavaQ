package javaset4;

public class Q1 {
public static String pavan(String pavan) {
	String s1=pavan;
	String store="";
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		System.out.println(store.indexOf(c));
		if(store.indexOf(c)==-1) {
			store=store+c;
		}
	}
	System.out.println(store);
	
	
	return s1;
}
}
