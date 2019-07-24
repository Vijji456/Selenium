package javaExmp;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int n, count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the n value");
		n=s.nextInt();
		s.close();
		for (int i=2;i<n;i++) {
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0)
		{
			System.out.println("Given number is a prime");
		}
		else
		{
			System.out.println("Given number is not a prime");
		}
	}

}
