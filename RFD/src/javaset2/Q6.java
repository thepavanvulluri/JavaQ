package javaset2;

public class Q6 {
	public static void main(String[] args) {
		String s1="hello1234";		
		
		int a[]=new int[s1.length()];
		int count=0;
		char c[]=s1.toCharArray();
		for(int i=0;i<s1.length();i++) {
			if(Character.isDigit(c[i])) {
				String s2="";
				s2=s2+c[i];
				int s3=Integer.parseInt(s2);
			 a[count]=s3;
			 count++;
			}
		}
		int sum=0;
		for(int i=0;i<count;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}