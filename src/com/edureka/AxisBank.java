package com.edureka;

public class AxisBank implements HDFC, UnionBank {

	public static void main(String[] args) {

	}

	@Override
	public void homeloan() {
		System.out.println("Axis-homeloan");
	}

	@Override
	public void carloan() {
		System.out.println("Axis-carloan");
	}

	@Override
	public void debit() {
		System.out.println("Axis-debit");
	}

	@Override
	public void credit() {
		System.out.println("Axis-credit");
	}

	@Override
	public void trade() {
		System.out.println("Axis-trade");

	}

}
