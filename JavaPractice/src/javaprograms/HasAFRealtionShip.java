package javaprograms;

class Address{
	int HNo;
	String StrtName, city, state;
	Address(int hno,String Sname, String CityName, String StateName)
	{
		this.HNo=hno;
		this.StrtName=Sname;
		this.city=CityName;
		this.state=StateName;
	}
}
class HasAFRealtionShip{
	int RollNum;
	String StudentName;
	Address studentAdd;
	HasAFRealtionShip(int Rno, String StName, Address SAdd)
	{
		this.RollNum=Rno;
		this.StudentName=StName;
		this.studentAdd=SAdd;
	}
	public static void main(String args[])
	{
		Address ad=new Address(1, "Manyata","Bangalore","Karnataka");
		HasAFRealtionShip obj=new HasAFRealtionShip(20, "Sai", ad);
		System.out.println(obj.RollNum);
		System.out.println(obj.StudentName);
		System.out.println(obj.studentAdd.HNo);
		System.out.println(obj.studentAdd.StrtName);
		System.out.println(obj.studentAdd.city);
		System.out.println(obj.studentAdd.state);
		
		
	}

}
