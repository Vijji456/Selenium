package javaprograms;
class ParentClass {
	int a=100;
}
public class SuperExample1 extends ParentClass {
	int a=110;
	void display()
	{
		System.out.println(a);
		System.out.println(super.a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExample1 obj=new SuperExample1();
		obj.display();
		
	}

}
