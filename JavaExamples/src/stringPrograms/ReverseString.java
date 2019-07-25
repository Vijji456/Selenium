package stringPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String Original, Reverse="";
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String to reverse");
		Original=s.nextLine();
		s.close();
		int len=Original.length();
		for(int i=len-1;i>=0;i--)
		{
			Reverse=Reverse+Original.charAt(i);
			
		}
		System.out.println("the reversed string is  "+Reverse);
		
	}

}
