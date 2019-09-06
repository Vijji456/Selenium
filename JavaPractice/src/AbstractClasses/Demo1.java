package AbstractClasses;
abstract class AbstractDemo1{
	public void myMethod() {
		System.out.println("First concrete method in abstract calss");
		}
	public void myMethod1() {
		System.out.println("Second concrete method in abstract calss");
	}
}
public class Demo1 extends AbstractDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d=new Demo1();
		d.myMethod();
		d.myMethod1();

	}

}
