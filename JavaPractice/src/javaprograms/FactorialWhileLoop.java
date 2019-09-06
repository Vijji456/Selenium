package javaprograms;
import java.util.*;
public class FactorialWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number to find factorial");
		int number=s.nextInt();
		long fact=1;
		int i=1;
		while(i<=number) {
			fact=fact*i;
			i++;
		}
		System.out.println("The factorial of given number is:"+fact);
		s.close();
			

	}

}
