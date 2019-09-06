package javaprograms;
import java.util.*;
public class DisplayPrimenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String PrimeNumbers="";
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		for(int i=1;i<=number;i++)
		{
			int count=0;
			for(int j=i; j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;					
				}				
			}
			if(count==2)
			{
				PrimeNumbers=PrimeNumbers + i+ " ";
			}			
		}
		System.out.println("Primenumbers from 1 to n are:");
		System.out.println(PrimeNumbers);
		s.close();

	}

}
