package javaset2;

public class Q7 {
public static void main(String[] args) {
	String s1="Karnataka";
	char a[]=s1.toCharArray();
	for(char c='a';c<='z';c++) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==c && c=='a') {
				count++;
			}
		}
		if(count>0) {
			System.out.println(c+"="+count);
		}
		
	}
}
}
