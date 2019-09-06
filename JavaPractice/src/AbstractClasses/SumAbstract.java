package AbstractClasses;

public class SumAbstract extends Sum {
	int sumOfTwo(int a,int b)
	{
		return (a+b);
	}
	int sumOfThree(int a,int b,int c)
	{
		return(a+b+c);
	}

	public static void main(String[] args) {
		Sum s=new SumAbstract();
		System.out.println("The sum of two numbers is:"+s.sumOfTwo(10, 20));
		System.out.println("The sum of three numbers is:"+s.sumOfThree(20, 30, 10));
	}

}
