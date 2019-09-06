package interfaces;

public class HDFC implements RBI {

	public static void main(String[] args) {
		HDFC h=new HDFC();
		h.deposit();
		h.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("I am the withdrawl method of HDFC");
	}

	@Override
	public void deposit() {
	System.out.println("I am the deposited method of HDFC");
		
	}

}