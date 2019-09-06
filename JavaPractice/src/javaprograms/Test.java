package javaprograms;

    class Test1 {
	Test1()
	{
		System.out.println("Constructor of parent class");
	}
    }
	class Test extends Test1{
		Test()	
	{
		System.out.println("Constructor of child class");
	}
	public static void main(String args[])
	{
		new Test();
	}

}
