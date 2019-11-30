package javaprograms;

public class IntegerPalindrome {

	public static void main(String[] args) {
		int num=12123,reversedInteger=0,reminder,originalInteger;
		originalInteger=num;
		while(num!=0) {
			reminder=num%10;
			reversedInteger=reversedInteger*10+reminder;
			num /=10;
		}
		
		if(reversedInteger==originalInteger) {
			System.out.println("Integer is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}

	}

}
