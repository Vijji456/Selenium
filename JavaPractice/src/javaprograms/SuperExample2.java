package javaprograms;
class ParentClass1 {
	void method()
	{
		System.out.println("Method of Parentclass 1");
	}
}
class ParentClass2 extends ParentClass1 {
	void method()
	{
		System.out.println("Method of Parentclass 2");
	}
}
class ParentClass3 extends ParentClass2{
	void method()
	{
		super.method();
		System.out.println("Method of Parentclass 3");
	}
}
public class SuperExample2 extends ParentClass3{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample2 obj=new SuperExample2();
		obj.method();

	}

}
