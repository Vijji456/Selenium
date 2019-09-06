package interfaces;


interface A
{
	void method1();
}
interface B extends A{
	void method2();
}
public class InterfaceExtendsInterface implements B {

	public static void main(String[] args) {
		B obj=new InterfaceExtendsInterface();
		obj.method1();
	}

	@Override
	public void method1() {
		System.out.println("I am a method of interface1");
	}

	@Override
	public void method2() {
		System.out.println("I am a method of interface2");
	}

}
