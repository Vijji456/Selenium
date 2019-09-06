package javaprograms;
import java.util.*;
public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, sum;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input values");
		num1=s.nextInt();
		num2=s.nextInt();
		sum=num1+num2;
		System.out.println("The sum is:"+sum);
		s.close();

	}

}
