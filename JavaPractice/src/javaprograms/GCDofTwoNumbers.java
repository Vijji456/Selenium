package javaprograms;
import java.util.*;
public class GCDofTwoNumbers {
	public static void main(String[] args) {
		int num1,num2, GCD=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the input values");
		num1=s.nextInt();
		num2=s.nextInt();
		for(int i=1;i<=num1 && i<=num2;i++) {
			if(num1%i==0 && num2%i==0)
				GCD=i;
		}
		System.out.printf("GCD of %d and %d is: %d",num1,num2,GCD);
		s.close();
			
		}
	

}
