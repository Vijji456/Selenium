package javaprograms;

   class InheritenceTeacher {
	String Designation="Teacher";
	String collegeName="BeginersBook";
	void does() {
		System.out.println("Teaching");
		}
}
	    public class PhysicsTeacher extends InheritenceTeacher{
		String Profession="PhysicsTeacher";
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysicsTeacher obj=new PhysicsTeacher();
		System.out.println(obj.Designation);
		System.out.println(obj.collegeName);
		System.out.println(obj.Profession);
		obj.does();
		}

	}

