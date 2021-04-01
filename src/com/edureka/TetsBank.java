package com.edureka;

public class TetsBank {

	public static void main(String[] args) {

		AxisBank ab = new AxisBank();
		ab.carloan();
		ab.credit();
		ab.debit();
		ab.homeloan();
		ab.trade();

		System.out.println(AxisBank.min_bal);
		HDFC fc = new AxisBank();
		fc.credit();
		fc.debit();
		fc.trade();

		UnionBank ub = new AxisBank();
		ub.carloan();
		ub.homeloan();

	}

}
