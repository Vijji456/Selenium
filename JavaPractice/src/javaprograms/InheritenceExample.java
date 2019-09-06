package javaprograms;
class Teacher {
	private String designation="Teacher";
	private String collegename="Beginers book";
	public void setDesignation(String designation) {
		this.designation=designation;
		}
	public String getDesignation() {
		return designation;
	}
	protected void setCollegename(String collegename) {
		this.collegename=collegename;
	}
	protected String getCollegename() {
		return collegename;
	}
	void does()
	{
		System.out.println("Teaching");
	}
	
	
}
public class InheritenceExample extends Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritenceExample obj=new InheritenceExample();
		System.out.println(obj.getDesignation());
		System.out.println(obj.getCollegename());
		obj.does();

	}

}
