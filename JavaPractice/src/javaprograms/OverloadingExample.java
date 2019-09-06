package javaprograms;

public class OverloadingExample {
void sum(int a,int b)
{
	System.out.println(a+b);
}
void sum(int a,int b,int z)
{
	System.out.println(a+b+z);
}
public static void main(String args[])
{
	OverloadingExample obj1=new OverloadingExample();
	obj1.sum(10, 20);;
	obj1.sum(10,10,50);
}
}
