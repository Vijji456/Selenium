package javaprograms;
class ParentExample {
	ParentExample()
	{
		System.out.println("constructor of Parent");
	}
}
public class ChildExample extends ParentExample{
	ChildExample()
	{
		System .out.println("Constructor of child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ChildExample();

	}

}
