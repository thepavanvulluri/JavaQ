package RFDpract;

public class ReverseWord {
	public static void main(String[] args) {
		String s1="my name is pavan";
		String s2[]=s1.split("");
		for(int i=s2.length-1;i>1;i--) {
			String s3=s2[i];
			System.out.print(s3);
		}
		
	}

}
