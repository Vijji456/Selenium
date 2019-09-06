package javaprograms;
class Parent2{
	void eat() {
		System.out.println("Properties of Parent calss2");
	}
}
public class Overriding3 extends Parent2{
	void eat()
	{
		System.out.println("Properties of child class");
	}
	void newMethod() {
		System.out.println("new method of child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding3 obj=new Overriding3();
		obj.eat();
		
		Parent2 obj2=new Parent2();
		obj2.eat();
	    
		Parent2 obj3=new Overriding3();
		obj3.eat();   //It calls the method of child class because overriding is a dynamic binding or runtime binding
		//obj3.newMethod();  Error because of newMethod is newly added in subclass so new properties of child class can not be available to parent calls
		

	}

}
