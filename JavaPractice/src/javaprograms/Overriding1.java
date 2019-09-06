package javaprograms;
class Parent{
	public void eat() {
		System.out.println("Method of Parent class");
	}
}
public class Overriding1 extends Parent {
	public void eat() {
		System.out.println("Method of Child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding1 obj=new Overriding1();
		obj.eat();

	}

}
