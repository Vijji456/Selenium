package encapsulation;
class encap
{
	private int empNo;
	private String Ename;
	private int Eage;
	
	public int getEmpno()
	{
		return empNo;
	}
	public String getEname()
	{
		return Ename;
	}
	public int getEage()
	{
		return Eage;
	}
	public void setEmpno(int Eno)
	{
		empNo=Eno;
	}
	public void setEname(String ename)
	{
		Ename=ename;
	}
	public void setEage(int eage) {
		Eage=eage;
	}
}
public class EncapDemo {

	public static void main(String[] args) {
		encap obj=new encap();
		obj.setEmpno(4189);
		obj.setEname("Vijji");
		obj.setEage(27);
		System.out.println("Employee number:"+obj.getEmpno());
		System.out.println("Employee name:"+obj.getEname());
		System.out.println("Employee age:"+obj.getEage());
	}

}
