package interfaces;
interface AA{
	int x=10;
	public void aaa();
}
interface BB{
	 int x=10;
	 public void aaa();
}
public class InterfaceExample implements AA,BB{
	

	public static void main(String[] args) {
		System.out.println("x value is:"+AA.x);
		System.out.println("X is:"+BB.x);
		int x=12;
		System.out.println(x);
	}

	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		System.out.println("wdwsdfwef");
		
		InterfaceExample obj=new InterfaceExample();
		obj.aaa();
	}

}
