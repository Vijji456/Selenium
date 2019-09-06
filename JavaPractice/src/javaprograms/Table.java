package javaprograms;
import java.util.*;
public class Table {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value");
		int n=s.nextInt();
		int i=1,result;
		s.close();
		
		while(i<=10)
		{
			result=n*i;
			System.out.printf("%d * %d = %d",n,i,result);
			System.out.printf("\n");
			i++;
		}
	}

}
