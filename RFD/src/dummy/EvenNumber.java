package dummy;

public class EvenNumber {
	static int count=0;
	public static int[] evenNum(int[] pavan) {
		int acc[]=new int[pavan.length];
		for(int i=0;i<pavan.length;i++) {
			if(pavan[i]%2==0) {
				 acc[count]=pavan[i];
				 count++;
			}
		}
		return acc;
	}

}
