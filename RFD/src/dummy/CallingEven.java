package dummy;

public class CallingEven {
	public static void main(String[] args) {
		EvenNumber f1=new EvenNumber();
		int[] hello= {10,20,30,41,55,123,24};
		int b[]=f1.evenNum(hello);
		for(int i=0;i<EvenNumber.count;i++) {
			System.out.println(b[i]);
		}
	}

}
