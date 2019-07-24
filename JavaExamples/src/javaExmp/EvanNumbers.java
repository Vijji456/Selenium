package javaExmp;

import java.util.Scanner;

public class EvanNumbers {
	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0) {
				System.out.println(i);
			}
		}
		s.close();
	}

}
