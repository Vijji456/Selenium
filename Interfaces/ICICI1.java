package Interfaces;

public class ICICI1 implements RBI1{
	public void withdrawl1() {
		System.out.println("I am the withdrawl method of ICIC1");
	}

	@Override
	public void deposit1() {
		System.out.println("I am the deposited method of ICICI1");
	}
}
