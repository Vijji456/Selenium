package javaprograms;

public class SetGetvalues {
	private int NoOfEmployess=0;
	public void setNoOfEmployees(int count)
	{
		NoOfEmployess=count;
	}
	public int getNoOfEmployess()
	{
		return NoOfEmployess;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetGetvalues obj=new SetGetvalues();
		obj.setNoOfEmployees(7813);
		System.out.println(obj.getNoOfEmployess());
	}

}
