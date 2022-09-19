package RFDpract;

public class Ouccerance {
	public static void main(String[] args) {
		String s1="hello";
		char c[]=s1.toCharArray();
		for(char can='a';can<='z';can++) {
			int count=0;
			for(int i=0;i<s1.length();i++) {
				if(can==c[i]) {
					count++;
				}
			}
			if(can>1) {
			System.out.print(can+" "+count);
		}
		}
	}

}
