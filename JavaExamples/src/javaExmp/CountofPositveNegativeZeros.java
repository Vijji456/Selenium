package javaExmp;

import java.util.Scanner;

public class CountofPositveNegativeZeros {

	public static void main(String[] args) {
		
		int[] array=new int[10];
		Scanner s=new Scanner(System.in);
		/*System.out.println("Enter the size of array");
		int size=s.nextInt();*/
		System.out.println("Enter the numbers into array");
		for(int i=0;i<10;i++) {
		array[i]=s.nextInt();
		}
		s.close();
		int countp=0,countn=0,countz=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>0) {
				countp++;
				
			}
			else if(array[i]<0) {
				countn++;
			}
			else
			{
				countz++;
			}
		}
		
		System.out.println("number of positve numbers are:"+countp);
		System.out.println("number of negative numbers are:"+countn);
		System.out.println("number of zero numbers are:"+countz);

	}

}
