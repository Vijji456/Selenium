package javaprograms;
import java.util.*;
public class SumOfArray {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {10,20,30,40,50,60};
		int sum=0;
		for(int num:array)
		{
			sum=sum+num;
		}
		System.out.println(sum);
		

	}*/
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input values into array");
		int array[]=new int[10];
		int sum=0;
		for(int i=0;i<10;i++)
		{
			array[i]=s.nextInt();
		}
		for(int num:array)
		{
			sum=sum+num;
		}
		System.out.println(sum);
		s.close();
	}
}
