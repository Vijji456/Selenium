package javaprograms;
class sample1{
	void disp(int a,int b)
	{
		System.out.println("I am the first disp method");
	}
	void disp(int a,int b,int c) {
		System.out.println("I am the second disp method");
	}
}
public class Overloading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 s=new sample1();
		s.disp(10, 20);
		s.disp(12, 13, 14);
		

	}

}
