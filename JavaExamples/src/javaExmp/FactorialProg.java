package javaExmp;

import java.util.Scanner;

public class FactorialProg {

	public static void main(String[] args) {
		int fact=1,num,i=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		s.close();
		while(i<=num)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of the number:"+fact);
	}

}
