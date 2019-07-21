package javaExmp;

import java.util.Scanner;

public class ArrayValues1 {

	public static void main(String[] args) {
		int asize;
		Scanner sc=new Scanner(System.in);
		System.out.println("Entert the size of the array");
		asize=sc.nextInt();
		System.out.println("Enter the values into array");
		int a[]=new int[asize];
		int sum=0;
		
		for(int i=0;i<asize;i++)
		{
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);
		System.out.println("Hello world");

	}

}
