package javaprograms;

public class StaticExample2 {
	static int a=10;
	String str2="non-static variable";
	public static void main(String args[]) {
		StaticExample2 obj1=new StaticExample2();
		StaticExample2 obj2=new StaticExample2();
		obj1.a=20;
		obj2.a=30;
	      /* This will overwrite the value of a because var1 has a single 
         * copy shared among both the objects.
         */
		obj1.str2="non-static variable1";
		System.out.println(obj1.a);
		System.out.println(obj1.str2);
		System.out.println(obj2.a);
		System.out.println(obj2.str2);
		
	}
	

}
