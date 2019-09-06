package javaprograms;
class sample4{
	public int disp(int a,int b) {
		System.out.println("First method");
		return(a);
	}
}
public class Overloading4 {
	public static void main(String args[]) {
		sample4 s=new sample4();
		s.disp(10,20);
	}

}
