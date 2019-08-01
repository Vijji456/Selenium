package javaExmp;

import java.util.Scanner;

public class GCDLCM {

	public static void main(String[] args) {
		int num1,num2,GCD=1,LCM;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values for num1 and num2");
		num1=s.nextInt();
		num2=s.nextInt();
		s.close();
		for(int i=1;i<=num1;i++)
		{
			if(num1%i==0&&num2%i==0)
			{
				GCD=i;
			}
			
		}
		System.out.println("GCD is:"+GCD);
		LCM=num1*num2/GCD;
		System.out.println("LCM is:"+LCM);
	}

}
