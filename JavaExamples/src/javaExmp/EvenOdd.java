package javaExmp;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the a value");
		a=s.nextInt();
		if(a%2==0)
			System.out.println("Given number is a even");
		else
			System.out.println("Given number is a odd");
		s.close();
	}

}
