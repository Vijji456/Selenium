package javaExmp;

import java.util.Scanner;

public class ArrayValues1 {

	public static void main(String[] args) {
		int asize;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of array");
		asize=s.nextInt();
		System.out.println("Enter the elements into array");
		int array[]=new int[asize];
		
		for(int i=0;i<asize;i++) {
			array[i]=s.nextInt();
		}
		System.out.println("The array is:"+array[4]);
	}

}
