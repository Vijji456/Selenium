package Interfaces;

public interface RBI1 {
	void withdrawl1();
	void deposit1();
	
	public static void main(String[] args) {
		RBI1 r1=new HDFC1();
		r1.deposit1();
		r1.withdrawl1();
		
		RBI1 r2=new ICICI1();
		r2.deposit1();
		r2.withdrawl1();
	}

}
