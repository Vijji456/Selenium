package javaprograms;

public class StaticExample5 {
	static String str="Ramu";
	int a=10;
	static class NestedClass {
	public void disp()
	{
		System.out.println(str);
		//System.out.println(a);
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample5.NestedClass obj=new StaticExample5.NestedClass();
		obj.disp();

	}

}
