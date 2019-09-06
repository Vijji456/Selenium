package javaprograms;

public class StaticExample4 {
	static void display()
	{
		System.out.println("Hello Java");
		System.out.println("Welocme to my world");
	}
	void method()
	{
		display();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample4 obj=new StaticExample4();
		obj.method();

	}

}
