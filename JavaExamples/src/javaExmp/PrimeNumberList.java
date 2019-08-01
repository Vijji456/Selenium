package javaExmp;

import java.util.Scanner;

public class PrimeNumberList {

	public static void main(String[] args) {
		int start,end,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the start number");
		start=s.nextInt();
		System.out.println("Enter the end number");
		end=s.nextInt();
		System.out.println("The prime numbers between"+start+end+" are:");
		s.close();
		int c=0;
		for(int i=start;i<=end;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
				count++;
				break;
				}
			}
			if(count==0)
			{
				System.out.print(i+" ");
				c++;
			}
			
		}
		System.out.println();
		System.out.println("The count of prime numbers between"+start+" and "+end+" is:"+c);
	}
}