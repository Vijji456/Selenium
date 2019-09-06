package javaprograms;
class sample3{
	void disp(int a,String s) {
		System.out.println("I am the first disp method of class sample3");
	}
	void disp(String s,int a) {
		System.out.println("I am the second disp method of class sample3");
	}
}
public class Overloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample3 s=new sample3();
		s.disp(10, "Durga");
		s.disp("Durga", 12);

	}

}
