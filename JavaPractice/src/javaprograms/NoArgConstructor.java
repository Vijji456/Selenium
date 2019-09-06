package javaprograms;

public class NoArgConstructor {
	NoArgConstructor()
	{
		int number=1;
		String name="Sairam";
		System.out.println(number);
		System.out.println(name);
	}	

	public static void main(String[] args) {
		new NoArgConstructor();
		//NoArgConstructor obj=new NoArgConstructor();
	}

}
