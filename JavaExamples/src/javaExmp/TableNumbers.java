package javaExmp;

import java.util.Scanner;

public class TableNumbers {

	public static void main(String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		num=s.nextInt();
		s.close();
		for(int i=1;i<=10;i++)
		{
			int result=num*i;
			System.out.printf("%d * %d= %d",num,i,result);
			System.out.printf("\n");
		}
		
	}

}
