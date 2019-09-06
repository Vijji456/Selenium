package javaprograms;

public class AdditionUsingConstructor {
	int num1,num2;
	AdditionUsingConstructor(int a,int b)
	{
		num1=a;
		num2=b;
		System.out.println(num1+num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdditionUsingConstructor obj=new AdditionUsingConstructor(10,20);
		

	}

}
