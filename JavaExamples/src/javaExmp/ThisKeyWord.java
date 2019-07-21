package javaExmp;

class ABC {
	int empno;
	String Ename;
	ABC(int empno,String Ename){
		this.empno=empno;
		this.Ename=Ename;
		

	}
}
public class ThisKeyWord {
	public static void main(String[] args) {
	ABC obj=new ABC(10,"Ravi");
	System.out.println(obj.empno);
	System.out.println(obj.Ename);
	}
	

}
