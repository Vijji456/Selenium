package stringPrograms;

import java.util.Scanner;

public class CompareTwoStrings {

	public static void main(String[] args) {
		String str1,str2;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first string");
		str1=s.next();
		System.out.println(str1.hashCode());
		System.out.println("Enter the second string");
		str2=s.next();
		System.out.println(str2.hashCode());
		s.close();
		int a=str1.compareTo(str2);
		System.out.println(a);
		
//		if(str1.compareTo(str2)>0)
//		{
//			System.out.println("first string is greater than secon string");
//		}
//		else if(str1.compareTo(str2)<0)
//		{
//			System.out.println("first string is less than second string");
//		}
//		else
//		{
//			System.out.println("Two strings are equal");
//		}
//		boolean b=str1.equals(str2);
//		System.out.println(b);
//		if (str1.equals(str2))
//		{
//			System.out.println("both strings are equal");
//		}
//		
//		else
//		{
//			System.out.println("not equal");
//		}
	}

}
