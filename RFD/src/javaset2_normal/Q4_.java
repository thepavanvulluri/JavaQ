package javaset2_normal;

public class Q4_ {
	public static void main(String[] args) {
		int a=3;
		boolean flag=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=false;
				break;
			}
		}
		if(flag==true) {
			System.out.println("primeno");
		}else {
			System.out.println("not a prime");
		}
			
		
	}
}


