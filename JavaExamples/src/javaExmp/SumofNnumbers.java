package javaExmp;

import java.util.Scanner;

public class SumofNnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter th n value");
		n=s.nextInt();
		for(int i=1;i<=n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of n numbers is:"+sum);
		s.close();
	}

}
