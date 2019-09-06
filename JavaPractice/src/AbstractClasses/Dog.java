package AbstractClasses;

public class Dog extends AbstractDemo2{

	public static void main(String[] args) {
		Dog d=new Dog();
		d.sound();
		d.walk();
		d.method();
		
		
		AbstractDemo2 d2=new Dog();
		d2.sound();
		d2.method();
		d2.walk();
	}

	@Override
	void sound() {
		System.out.println("Dog sounds Bow");
	}

	@Override
	void walk() {
		System.out.println("Dog has 4 legs");
	}

}
