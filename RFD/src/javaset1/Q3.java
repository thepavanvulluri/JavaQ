package javaset1;

public class Q3 {
	public static void main(String[] args) {
		int odd=0;
		for(int i=10;i<=50;i++) {
			if(i%2==1) {
				odd=odd+i;
			}
		}
		System.out.println(odd);
	}

}
