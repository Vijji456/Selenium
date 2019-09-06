package javaprograms;
class Human1{
	public void walk() {
		System.out.println("Huamn Walk");
	}
}
public class DynamicBinding extends Human1 {
	public void walk() {
		System.out.println("Boy Walk");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human1 h=new DynamicBinding();
		h.walk();
		
		Human1 h1=new Human1();
		h1.walk();
		
		

	}

}
