package javaprograms;

interface MultiplyNums{
	public int mulTwo(int a,int b);
	public int mulThree(int a,int b,int c);
	}
public class Multiply implements MultiplyNums {

	public static void main(String[] args) {
		MultiplyNums obj=new Multiply();
		System.out.println("The result of two numbers is:"+obj.mulTwo(2, 3));
		System.out.println("The result of three numbers is:"+obj.mulThree(1, 5, 4));
	}

	@Override
	public int mulTwo(int a, int b) {
		return a*b;
	}

	@Override
	public int mulThree(int a, int b, int c) {
		return a*b*c;
	}

}
