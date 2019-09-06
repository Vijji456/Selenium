package javaprograms;
class Animal{
	public void sound() {
		System.out.println("Animal is making sound");
	}
}
class Horse extends Animal{
	public void sound() {
		System.out.println("Horse Sounds Neigh");
	}
}
class Cat extends Animal{
	public void sound() {
		System.out.println("Cat sounds Meow");
	}
}
public class PolyMorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal c=new Cat();
		c.sound();
		
	Animal h=new Horse();
	h.sound();
	
	Animal a=new Animal();
	a.sound();
	

	}

}
