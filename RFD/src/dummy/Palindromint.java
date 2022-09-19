package dummy;

public class Palindromint {
public static void main(String[] args) {
	int s1=12321;
	int copy=s1;
	int lastDigit=0;
	int reverse=0;
	while(s1!=0) {
		lastDigit=s1%10;
		reverse=reverse*10+lastDigit;
		s1=s1/10;
	}
	System.out.println(reverse);
	if(copy==reverse) {
		System.out.println("palindrom");
	}else {
		System.out.println("not a palindrom");
	}
} 
}
