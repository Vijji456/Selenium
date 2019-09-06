package javaprograms;
import java.util.*;
public class VowelConsonent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character");
		boolean isVowel=false;
		char ch=s.next().charAt(0);
		s.close();
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
		case 'U':isVowel=true;
		}
		if(isVowel==true)
		{
			System.out.println("Given character is vowel");
		}
		else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("The given charcter is consonent");
		}
		else
		{
			System.out.println("the given character is not a alphabet");
		}
			
		}
		
		

	}

