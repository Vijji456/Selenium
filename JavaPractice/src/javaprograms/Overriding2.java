package javaprograms;
class Parent1{
	public void eat1() {
		System.out.println("Properties of Parent class");
	}
}
public class Overriding2 extends Parent1 {
	public void eat1() {
		System.out.println("Properties of child class");
		super.eat1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding2 obj=new Overriding2();
		obj.eat1();

	}

}
