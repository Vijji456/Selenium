package javaExmp;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		int[] array=new int[5];
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements into array");
		s.close();
		for(int i=0;i<5;i++)
		{
			array[i]=s.nextInt();
			sum=sum+array[i];
		}
		System.out.println("Sum of array elements is:"+sum);
	}

}
