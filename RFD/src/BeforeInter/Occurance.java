package BeforeInter;

public class Occurance {
	public static void main(String[] args) {
		String s1="pavanhdhdzzz";
		char b[]=s1.toCharArray();
		for(char c='a';c<='z';c++) {
			int count=0;
			for(int i=0;i<s1.length();i++) {
				if(b[i]==c) {
					count++;
					
				}
				
			}
			if(count>0) {
				System.out.println(c+"=="+count);
			}
		}
	}

}
