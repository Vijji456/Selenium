package stringPrograms;

import java.util.Scanner;

public class RemoveVowels {

	public static void main(String[] args) {
		String OriginalStr, NewStr;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		OriginalStr=s.nextLine();	
		NewStr=OriginalStr.replaceAll("[aeiouAEIOU]", "");
		System.out.println("All Vowels are removed:"+NewStr);
		
		//Consonents removing
		String Str2, ConsRmv;
		System.out.println("Enter the another string");
		Str2=s.nextLine();
		ConsRmv=Str2.replaceAll("[bcdfghjklmnpqrstvwxyzBCDFGHIJKLMNPQRSTVWXYZ]", "");
		System.out.println("The consonents are removed from the given string, now the new string is: "+ConsRmv);
		
		
	}

}
