package javaprograms;

import java.util.Scanner;

public class SmallCharAtLastInGivenString {

	public static void main(String[] args) {
		String str;
		String str1=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		str=sc.nextLine();
		int count=0;
		
		
		sc.close();
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				str1=str1+str.charAt(i);
				count++;
			}
		}
			System.out.println(str1);
			
			while(count<str.length()) {
				str1=str1+str.charAt(count);
				count++;
			}
			
			System.out.println(str1);
		
	}
	}



