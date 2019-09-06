package javaprograms;
class ParentClass4{
	ParentClass4()
	{
		System.out.println("Constructor of Parent class");
	}
	ParentClass4(String str)
	{
		System.out.println("Parametrized constructor of Parent calss");
	}
}
public class SuperExample3 extends ParentClass4 {
	SuperExample3()
	{
		super("Hello");
		System.out.println("constructor of child calss");
	}
	SuperExample3(int a)
	{
		
		System.out.println("Parametrized Constructor of child class");
	}
	public static void main(String args[]) {
	new SuperExample3();
	new SuperExample3(10);
	}

}
