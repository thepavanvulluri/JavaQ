package BeforeInter;

public class NumberPattern {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=7;
		int d=15;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<=4;j++) {
				if(i==1) {
					System.out.print(a);
					a++;
			}else if(i==2) {
				System.out.print(b);
				b++;
			}
			else if(i==3) {
				System.out.print(c);
				c++;
			}
			else {
				System.out.print(d);
				d++;
			}
			System.out.println();
			}
			
		}
		
	}

}
