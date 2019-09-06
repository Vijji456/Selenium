package javaprograms;
import java.util.*;
public class RandomNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		System.out.println("Random numbers are:");
		for(int i=1;i<=5;i++)
		{
			System.out.println(r.nextInt(200));
		}

	}

}
