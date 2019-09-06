package javaprograms;

public class Staticexample1 {
    static void m1()
	{
		System.out.println("Static method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		m1();//without obj creation we can call static methods.

	}

}
