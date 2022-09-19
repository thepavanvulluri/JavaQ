package RFDpract;

public class Removeduplicats {
	public static void main(String[] args) {
	String s1="Pavan";
	String store="";
	for(int i=0;i<s1.length();i++) {
		char c=s1.charAt(i);
		if(store.indexOf(c)==-1) {
			store=store+c;
		}
	}
	System.out.println(store);
	}
}
