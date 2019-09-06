package javaprograms;

public class StaticExample3 {
	static int a=10;
	static String name="Ravi";
	String add="Bangalore";//non static variable
	public static void main(String[] args)
	{
		System.out.println("variable a is:"+a);
		System.out.println("Name is :"+name);// we can call static variables without obj creation
		StaticExample3 obj=new StaticExample3();
		System.out.println("Address is:"+obj.add);// we need obj creation for non-static variables
	}

}
