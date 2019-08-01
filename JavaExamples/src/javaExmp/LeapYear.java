package javaExmp;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		int year;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the year");
		year=s.nextInt();
		if(year%4==0)
			System.out.println("Given year is a leap year");
		else
			System.out.println("Given year is a normal year");
		
		s.close();
			}

}
