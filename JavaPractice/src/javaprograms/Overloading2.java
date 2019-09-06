package javaprograms;
class sample2{
	void disp(int a) {
		System.out.println("I am the first disp method of class sample2");
	}
	void disp(char c) {
		System.out.println("I am the second disp method of class sample2");
	}
	void disp(String s) {
		System.out.println("I am the Third disp method of class sample2");
	}
	void disp()
	{
		System.out.println("I am the fourth disp method of class sample2");
	}
}
public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample2 s=new sample2();
		s.disp(10);
		s.disp('a');
		s.disp();
		s.disp("Ravi");


	}

}
