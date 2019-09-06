package javaprograms;

import interfaces.A;

class A {
	void method()
	{
		System.out.println("Parent calss method");
	}
}
public class InheritanceExample1 extends A{
	void method1()
	{
		System.out.println("child calss method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//InheritanceExample1 obj=new InheritanceExample1();----Valid(by using this reference We can call both parent and chid class methods)
		//InheritanceExample1 obj1=new A();----InValid
		A obj1=new InheritanceExample1();// Valid-----(by using this reference We can call only parent class methods)
		obj1.method();
		
		//obj.method1();
		
	}

}
