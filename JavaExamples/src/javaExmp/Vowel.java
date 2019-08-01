package javaExmp;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		char ch;
		System.out.println("Enter the character");
		Scanner s=new Scanner(System.in);
		ch=s.next().charAt(0);
		boolean isVowel=false;
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': isVowel=true;
		}
		if(isVowel==true) {
			System.out.println("given character is a vowel");
		}
		else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
			System.out.println("Given character is a consonent");
		}
		else {
			System.out.println("Geiven character is not a alphabet");
		}
			s.close();
		
		}
		

	}


