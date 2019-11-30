package javaprograms;

class EncapsExmp1 {
private int Sno;
private String Sname;

public void setSno(int sno) {
	this.Sno=sno;
}
public void setSname(String sname) {
	this.Sname=sname;
}
public int getSno() {
	return Sno;
	
}
public String getSname() {
	return Sname;
	
}

}
public class EncapsExmp{
	public static void main(String[] args) {
		EncapsExmp1 obj=new EncapsExmp1();
		obj.setSno(1);
		obj.setSname("Ravi");
		System.out.println(obj.getSno());
		System.out.println(obj.getSname());
	}

	
	
}
