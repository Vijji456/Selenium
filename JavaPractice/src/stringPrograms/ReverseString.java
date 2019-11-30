package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str,a="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		str=s.nextLine();
		s.close();
		int strlength=str.length();
		for(int i=strlength-1;i>=0;i--)
		{
			a=a+str.charAt(i);
		}
		System.out.println("the reversed string is: "+a);		
	}
}
