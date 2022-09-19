package javaset1;

public class Q2 {
	public static void main(String[] args) {
		int a[]= {28,45,36,87,66,55,99};
		int store=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>store) {
				store=a[i];
			}
			
		}
		System.out.println(store);
	}

}
