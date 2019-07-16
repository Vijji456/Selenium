package Interfaces;

public class ICICI implements RBI {

	public static void main(String[] args) {
	
		ICICI i=new ICICI();
		i.deposit();
		i.withdrawl();

	}

	@Override
	public void withdrawl() {
		System.out.println("I am the withdrawl method of ICICI");
	}

	@Override
	public void deposit() {
		System.out.println("I am the deposited method of ICICI");
	}

}
