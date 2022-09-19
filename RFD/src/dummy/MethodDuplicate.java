package dummy;

public class MethodDuplicate {
	public static String duplicate(String pavan) {
		String c1=pavan;
		String rev="";
			for(int i=0;i<c1.length();i++) {
				char c=c1.charAt(i);
				if(rev.indexOf(i)==-1) {
					rev=rev+c;
				 }
			}
			return rev;
	}

}
