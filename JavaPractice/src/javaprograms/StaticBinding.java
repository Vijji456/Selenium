package javaprograms;
class Human{
	public static void walk() {
		System.out.println("Huamn Walk");
	}
}
public class StaticBinding extends Human {
	public static void walk() {
		System.out.println("Boy Walk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h=new StaticBinding();
		h.walk();
		
		Human h1=new Human();
		h1.walk();
		
		

	}

}
