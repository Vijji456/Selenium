package javaprograms;
import java.util.*;
public class FactorilForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		number=s.nextInt();
		for(int i=1;i<=number;i++) {
			fact=fact*i;
			
		}
		System.out.println("Te factorial of givenn number is:"+fact);
		s.close();

	}

}
