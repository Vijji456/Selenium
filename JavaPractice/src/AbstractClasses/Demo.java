package AbstractClasses;
abstract class AbstractDemo{
	abstract public void myMethod();
	public void concreteMethod()
	{
		System.out.println("Concrete method in abstact class");
	}
	
}
public class Demo extends AbstractDemo {
	public void myMethod() {
		System.out.println("Abstarct method implementation in concrete class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new Demo();
		d.myMethod();
		d.concreteMethod();
		
		//AbstractDemo d1=new AbstractDemo();---> Invalid- we should not create object for abstract class

	}

}
