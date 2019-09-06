package javaprograms;

import interfaces.B;

class B
{
	int a=10;
}
public class EE {
 private int x=10;
 void method()
{
	System.out.println("I am a method of class EE");
}
	public static void main(String[] args) {
		EE e=new EE();
		System.out.println(e.x);
		e.method();
		
		B b=new B();
	System.out.println(b.a);
				
	}

}
