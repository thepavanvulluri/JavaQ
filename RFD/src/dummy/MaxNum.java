package dummy;

public class MaxNum {
	public static void main(String[] args) {
	int c[]= {10,20,30,50,60};
	int max=c[0];
	for(int i=0;i<c.length;i++) {
		if(c[i]<max) {
			max=c[i];
		}
	}
	System.out.println(max);
	}

}
