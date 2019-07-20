package Other;


public class DD {

	public static void main(String[] args) {
		DD d=new DD();
		d= null;
		
		DD a=new DD();
		DD b=new DD();
		a=b;
		System.gc();
	}
	protected void finalize() throws Throwable{
		System.out.println("I am a gorbage collector activated by JVM");
	}

}
