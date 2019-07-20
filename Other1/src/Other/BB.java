package Other;

import javaprograms.AA;

   public class BB extends AA {
	public void m2()
	{
		System.out.println("method of class BB");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		BB b=new BB();
		b.m2();
		b.m1();
		
		AA a=new AA();
		a.m1();
		
		AA a1=new BB();
		a1.m1();
		
		//BB b1=new AA();  Invalid
		//b.m1();
		

	}

}
