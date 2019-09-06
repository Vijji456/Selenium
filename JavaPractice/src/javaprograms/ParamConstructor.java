package javaprograms;

public class ParamConstructor {
	int empId;
	String Ename;
	ParamConstructor(int id,String name) {
		this.empId=id;
		this.Ename=name;
		System.out.println("ID: "+empId+"Name: "+Ename);
	}

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		ParamConstructor obj1=new ParamConstructor(1,"SaiRam");
		ParamConstructor obj2=new ParamConstructor(2,"Narayana");
		
		

	}

}
