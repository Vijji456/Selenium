package javaprograms;
class CarDetails
{
	int CarNo;
	String CarName;
	CarDetails(int Cno, String Cname)
	{
		this.CarNo=Cno;
		this.CarName=Cname;
	}
}
class DriverDetails extends CarDetails{
	String DriverName;
	DriverDetails(String Dname,int CNO, String CNAME)
	{
	super(CNO,CNAME);
	this.DriverName=Dname;
	}
}
 class AssociationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DriverDetails dobj=new DriverDetails("Ravi",2345,"Benz");
		System.out.println(dobj.DriverName+ " is a car driver of car"+dobj.CarName);

	}

}
